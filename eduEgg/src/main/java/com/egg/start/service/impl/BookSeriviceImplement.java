package com.egg.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egg.start.entity.BookEntity;
import com.egg.start.mapper.BookMapper;
import com.egg.start.repository.BaseRepository;
import com.egg.start.repository.BookRepository;
import com.egg.start.service.BookService;

@Service
public class BookSeriviceImplement extends BaseServiceImpl<BookEntity, Long> implements BookService {

	private BookRepository bookRepo;
	private BookMapper bookMapper;

	@Autowired
	public BookSeriviceImplement(BaseRepository<BookEntity, Long> baseRepository, BookRepository bookRepo,
			BookMapper bookMapper) {
		super(baseRepository);
		this.bookMapper = bookMapper;
		this.bookRepo = bookRepo;
	}

}
