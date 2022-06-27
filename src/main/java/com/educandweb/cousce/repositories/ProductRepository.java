package com.educandweb.cousce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandweb.cousce.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	
}
