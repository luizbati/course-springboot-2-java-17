package com.educandweb.cousce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandweb.cousce.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
}
