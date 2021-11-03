package com.egg.start.service;

import java.util.List;

public interface BaseService<E> {
	
	public List<E> findAll() throws Exception;//Searched in all BD
	
	public E findById(Long id) throws Exception;//Searched in the BD for id
	
	public E findByStringData(String data) throws Exception;//Searched in BD for data string pass
	
	public E save(E entity) throws Exception;//Save the data in la BD
	
	public E update(Long id, E entity) throws Exception;//Update data in the BD for ID
	
	public boolean delete(Long id) throws Exception;//Delete data in BD for ID

}
