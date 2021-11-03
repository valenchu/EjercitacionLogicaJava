package com.egg.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.start.entity.EditorialEntity;
import com.egg.start.mapper.EditorialMapper;
import com.egg.start.repository.EditorialRepository;
import com.egg.start.service.BaseService;
import com.egg.start.service.EditorialService;

@Service
public class EditorialServiceImplement implements EditorialService, BaseService<EditorialEntity> {

	private EditorialRepository editorialRepo;
	private EditorialMapper editoMapper;

	@Autowired
	public EditorialServiceImplement(EditorialRepository editorialRepo, EditorialMapper editoMapper) {
		this.editorialRepo = editorialRepo;
		this.editoMapper = editoMapper;
	}

	@Override
	@Transactional
	public List<EditorialEntity> findAll() throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public EditorialEntity findById(Long id) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public EditorialEntity findByStringData(String data) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public EditorialEntity save(EditorialEntity entity) throws Exception {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@Transactional
	public EditorialEntity update(Long id, EditorialEntity entity) throws Exception {
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
