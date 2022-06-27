package com.educandweb.cousce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandweb.cousce.entities.Category;
import com.educandweb.cousce.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
		
	}
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(null);
		return obj.get();
		
	}
	

}
