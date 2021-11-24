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

import com.egg.start.entity.BaseEntityPersona;
import com.egg.start.entity.BookEntity;
import com.egg.start.service.impl.BaseServiceImpl;
/*
 * First E equals entity for basecontroller
 * Second E equals entity for baseservice and Long is the id
 * Third E equals entity for basecontroller interface
 * 
 * First S Obtain the service de baseserviceimpl
 * Long to firs is the ID to send for obtain the methot
 * 
 * Second Long is the ID for baseController
 * 
 * */
public abstract class BaseControllerImplement <E extends BaseEntityPersona, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

	protected S service; //This is the service with methot for the call any parameters!
	
	@Autowired
	public BaseControllerImplement(S service) {
		this.service = service;
	}

	/*
	 * Method that get all book in BD
	 */
	@GetMapping("")
	public ResponseEntity<?> getAll() {
		try {
			// Return all book in BD with bookService.findAll
			return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
		} catch (Exception e) {
			// if this get error return a status notfoun with a mensage in the body
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("{\"error\":\"Error to get DB of book, please try again later\"}");
		}
	}

	/*
	 * Method that get one book for id
	 */
	@GetMapping("/{id}")
	public ResponseEntity<?> getOne(@PathVariable(name = "id") Long id) {
		try {
			// Return all book in BD with bookService.findAll
			return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
		} catch (Exception e) {
			// if this get error return a status notfoun with a mensage in the body
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("{\"error\":\"Error to get book, please try again later\"}");
		}
	}

	/*
	 * Method that save a book in the BD
	 */
	@PostMapping("")
	public ResponseEntity<?> save(@RequestBody E book) {
		try {
			// Return all book in BD with bookService.findAll
			return ResponseEntity.status(HttpStatus.OK).body(service.save(book));
		} catch (Exception e) {
			// if this get error return a status notfoun with a mensage in the body
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error to save, please try again later\"}");
		}
	}

	/*
	 * Method that update a book in the BD, passing an id and a book entity
	 */
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable(name = "id") Long id, @RequestBody E book) {
		try {
			// Return all book in BD with bookService.findAll
			return ResponseEntity.status(HttpStatus.OK).body(service.update(id, book));
		} catch (Exception e) {
			// if this get error return a status notfoun with a mensage in the body
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error to update, please try again later\"}");
		}
	}

	/*
	 * Method that delete a book in BD, this delete is a soft deleted, only it is
	 * given deregister
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(name = "id") Long id) {
		try {
			// Return all book in BD with bookService.findAll
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));
		} catch (Exception e) {
			// if this get error return a status notfoun with a mensage in the body
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("{\"error\":\"Error to delete, please try again later\"}");
		}
	}
}
