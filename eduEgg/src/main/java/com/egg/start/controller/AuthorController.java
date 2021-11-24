package com.egg.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egg.start.entity.AuthorEntity;
import com.egg.start.service.impl.AuthorServiceImplement;

@RequestMapping(path = "/author")
@RestController
@CrossOrigin("*")
public class AuthorController extends BaseControllerImplement<AuthorEntity, AuthorServiceImplement> {

	public AuthorController(AuthorServiceImplement service) {
		super(service);
		// TODO Auto-generated constructor stub
	}
	


}
