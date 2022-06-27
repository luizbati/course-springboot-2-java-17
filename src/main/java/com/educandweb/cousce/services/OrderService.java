package com.educandweb.cousce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandweb.cousce.entities.Order;
import com.educandweb.cousce.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(null);
		return obj.get();
		
	}
	

}
