package com.egg.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.start.entity.AuthorEntity;
import com.egg.start.mapper.AuthorMapper;
import com.egg.start.repository.AuthorRepository;
import com.egg.start.repository.BaseRepository;
import com.egg.start.service.AuthorService;

@Service
public class AuthorServiceImplement extends BaseServiceImpl<AuthorEntity, Long> implements AuthorService {

	private AuthorRepository authorRepo;
	private AuthorMapper authorMapper;

	@Autowired
	public AuthorServiceImplement(BaseRepository<AuthorEntity, Long> baseRepository, AuthorRepository authorRepo,
			AuthorMapper authorMapper) {
		super(baseRepository);
		this.authorMapper = authorMapper;
		this.authorRepo = authorRepo;
	}

}
