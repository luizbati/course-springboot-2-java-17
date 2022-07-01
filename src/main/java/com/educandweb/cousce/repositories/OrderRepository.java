package com.educandweb.cousce.repositories;

import com.educandweb.cousce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import com.educandweb.cousce.entities.OrderItem;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderItem,Long>{

    public void saveAll(List<Order> asList);
	
}
