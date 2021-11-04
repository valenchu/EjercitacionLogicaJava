package com.egg.start.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@CrossOrigin("*")
public class StartIndex {
	
	
	@GetMapping("/")
	public String todoOk() {
		return "TODO OK";
	}

}
