package com.educandweb.cousce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandweb.cousce.entities.User;
import com.educandweb.cousce.repositories.UserRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(null);
		return obj.get();
		
	}
	

}
