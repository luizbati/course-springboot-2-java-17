package com.educandweb.cousce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandweb.cousce.entities.Order;
import com.educandweb.cousce.entities.OrderItem;
import com.educandweb.cousce.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
		
	}
	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(null);
		return obj.get();
		
	}
	

}
