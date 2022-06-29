package com.educandweb.cousce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandweb.cousce.entities.User;

public interface OrdeItemRepository extends JpaRepository<User,Long>{
	
}
