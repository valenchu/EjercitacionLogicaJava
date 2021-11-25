package com.egg.start.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.egg.start.security.entity.UserEntity;
import com.egg.start.security.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/user")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<?> registerUser(@RequestBody UserEntity user){
		try {
			
			return ResponseEntity.status(HttpStatus.CREATED).body(userService.register(user));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error to save, please try again later\"}"
					+"\n{\"Message\":"+e.getMessage());
		}
	}

}
