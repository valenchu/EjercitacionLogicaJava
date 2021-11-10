package com.egg.start.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.start.entity.BaseEntityPersona;
import com.egg.start.repository.BaseRepository;
import com.egg.start.service.BaseService;

public abstract class BaseServiceImpl<E extends BaseEntityPersona, ID> implements BaseService<E, ID> {

	protected BaseRepository<E, ID> baseRepository;

	public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
		this.baseRepository = baseRepository;
	}

	@Override
	@Transactional
	public List<E> findAll() throws Exception {
		try {
			return this.baseRepository.findAll();

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E findById(ID id) throws Exception {
		try {
			Optional<E> entityOptional = baseRepository.findById(id);
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public E save(E entity) throws Exception {
		try {
			return entity = baseRepository.save(entity);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	@Transactional
	public E update(ID id, E entity) throws Exception {
		try {
			Optional<E> book = baseRepository.findById(id);
			E books = book.get();
			books = baseRepository.save(entity);
			return books;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	@Transactional
	public boolean delete(ID id) throws Exception {
		try {
			if (baseRepository.existsById(id)) {
				baseRepository.deleteById(id);
				return true;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
