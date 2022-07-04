package com.educandweb.cousce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.educandweb.cousce.entities.User;
import com.educandweb.cousce.repositories.UserRepository;
import com.educandweb.cousce.services.exceptions.DatabaseException;
import com.educandweb.cousce.services.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(null);
		return obj.orElseThrow(()->new ResourceNotFoundException(id));
		
	}
	public User insert(User obj) {
		return repository.save(obj);
	}
	public void delete(Long id) {
		
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	public User update(Long id,User obj) {
		try {
		User entity = repository.getOne(id);
		updateData(entity,obj);
		return repository.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
