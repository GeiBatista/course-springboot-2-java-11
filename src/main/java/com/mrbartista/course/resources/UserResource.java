package com.mrbartista.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrbartista.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		//User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		return ResponseEntity.ok().body(u);
	}
}
