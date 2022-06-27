package com.educandweb.cousce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandweb.cousce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{
	
}
