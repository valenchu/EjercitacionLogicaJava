package com.egg.start.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.egg.start.entity.BaseEntityPersona;

public interface BaseController<E extends BaseEntityPersona, ID> {

	public ResponseEntity<?> getAll();

	public ResponseEntity<?> getOne(@PathVariable ID id);

	public ResponseEntity<?> save(@RequestBody E entity);

	public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);

	public ResponseEntity<?> delete(@PathVariable ID id);
}
