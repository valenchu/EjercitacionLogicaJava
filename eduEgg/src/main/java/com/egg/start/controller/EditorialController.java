package com.egg.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.egg.start.entity.EditorialEntity;
import com.egg.start.service.impl.EditorialServiceImplement;

@RequestMapping(path = "/editorial")
@RestController
@CrossOrigin("*")
public class EditorialController extends BaseControllerImplement<EditorialEntity, EditorialServiceImplement>{

	public EditorialController(EditorialServiceImplement service) {
		super(service);
		// TODO Auto-generated constructor stub
	}


}
