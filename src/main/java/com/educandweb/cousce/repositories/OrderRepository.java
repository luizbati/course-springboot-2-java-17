package com.educandweb.cousce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandweb.cousce.entities.OrderItem;

public interface OrderRepository extends JpaRepository<OrderItem,Long>{
	
}
