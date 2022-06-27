package com.educandweb.cousce.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandweb.cousce.entities.User;
import com.educandweb.cousce.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class ProductResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User>list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping( value= "/{id}")
	public ResponseEntity<User>findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	

}
