package com.egg.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.start.entity.AuthorEntity;
import com.egg.start.mapper.AuthorMapper;
import com.egg.start.repository.AuthorRepository;
import com.egg.start.service.AuthorService;
import com.egg.start.service.BaseService;

@Service
public class AuthorServiceImplement implements AuthorService, BaseService<AuthorEntity> {

	private AuthorRepository authorRepo;
	private AuthorMapper authorMapper;

	@Autowired
	public AuthorServiceImplement(AuthorRepository authorRepo, AuthorMapper authorMapper) {
		this.authorRepo = authorRepo;
		this.authorMapper = authorMapper;
	}

	@Override
	@Transactional
	public List<AuthorEntity> findAll() throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public AuthorEntity findById(Long id) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public AuthorEntity findByStringData(String data) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public AuthorEntity save(AuthorEntity entity) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public AuthorEntity update(Long id, AuthorEntity entity) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
