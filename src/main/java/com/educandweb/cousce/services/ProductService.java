package com.educandweb.cousce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandweb.cousce.entities.Product;
import com.educandweb.cousce.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
		
	}
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(null);
		return obj.get();
		
	}
	

}
