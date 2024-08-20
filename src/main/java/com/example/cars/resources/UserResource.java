package com.example.cars.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cars.entities.Users;

@RestController
@RequestMapping("/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<Users> findAll(){
	 Users u = new Users( 1L, "111", "11111", "222222", "2222");
	 return ResponseEntity.ok().body(u);
 }
}
