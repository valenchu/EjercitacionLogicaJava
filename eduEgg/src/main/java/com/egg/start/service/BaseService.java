package com.egg.start.service;

import java.util.List;

import com.egg.start.entity.BaseEntityPersona;

public interface BaseService<E extends BaseEntityPersona, ID> {

	public List<E> findAll() throws Exception;// Searched in all BD

	public E findById(ID id) throws Exception;// Searched in the BD for id

	public E save(E entity) throws Exception;// Save the data in la BD

	public E update(ID id, E entity) throws Exception;// Update data in the BD for ID

	public boolean delete(ID id) throws Exception;// Delete data in BD for ID

}
