package com.egg.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egg.start.entity.BookEntity;
import com.egg.start.service.impl.BookSeriviceImplement;

@RequestMapping(path = "/book")
@RestController
@CrossOrigin("*")
public class BookController extends BaseControllerImplement<BookEntity,BookSeriviceImplement> {
	
	public BookController(BookSeriviceImplement service) {
		super(service);
		// TODO Auto-generated constructor stub
	}


}
