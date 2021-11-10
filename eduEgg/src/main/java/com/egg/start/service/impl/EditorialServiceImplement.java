package com.egg.start.service.impl;

import org.springframework.stereotype.Service;

import com.egg.start.entity.AuthorEntity;
import com.egg.start.entity.EditorialEntity;
import com.egg.start.mapper.EditorialMapper;
import com.egg.start.repository.BaseRepository;
import com.egg.start.repository.EditorialRepository;
import com.egg.start.service.EditorialService;

@Service
public class EditorialServiceImplement extends BaseServiceImpl<EditorialEntity, Long> implements EditorialService {

	private EditorialRepository editorialRepo;
	private EditorialMapper editorialMapper;

	public EditorialServiceImplement(BaseRepository<EditorialEntity, Long> baseRepository,
			EditorialRepository editorialRepo, EditorialMapper editorialMapper) {
		super(baseRepository);
		this.editorialMapper = editorialMapper;
		this.editorialRepo = editorialRepo;
	}

}
