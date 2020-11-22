package com.homelearning.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homelearning.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class userResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Robson", "robson@robson.com", "646464", "5214");
				return ResponseEntity.ok().body(u);
		
	}
}
