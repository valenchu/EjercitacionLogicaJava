package com.egg.start.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.start.entity.BookEntity;
import com.egg.start.mapper.BookMapper;
import com.egg.start.repository.BookRepository;
import com.egg.start.service.BaseService;
import com.egg.start.service.BookService;

@Service
public class BookSeriviceImplement implements BookService, BaseService<BookEntity> {

	private BookRepository bookRepo;
	private BookMapper bookMapper;

	@Autowired
	public BookSeriviceImplement(BookRepository bookRepo, BookMapper bookMapper) {
		this.bookRepo = bookRepo;
		this.bookMapper = bookMapper;
	}

	@Override
	@Transactional
	public List<BookEntity> findAll() throws Exception {
		try {
			List<BookEntity> book = this.bookRepo.findAll();
			return book;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public BookEntity findById(Long id) throws Exception {
		try {
			Optional<BookEntity> entityOptional = bookRepo.findById(id.toString());
			return entityOptional.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public BookEntity findByStringData(String data) throws Exception {
		try {
			Optional<BookEntity> bookTitle = bookRepo.findByTitle(data);
			return bookTitle.get();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	@Transactional
	public BookEntity save(BookEntity entity) throws Exception {
		try {
			return entity = bookRepo.save(entity);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	@Transactional
	public BookEntity update(Long id, BookEntity entity) throws Exception {
		try {
			Optional<BookEntity> book = bookRepo.findById(id.toString());
			BookEntity books = book.get();
			books = bookRepo.save(books);
			return books;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	@Transactional
	public boolean delete(Long id) throws Exception {
		try {
			if (bookRepo.existsById(id.toString())) {
				bookRepo.deleteById(id.toString());
				return true;
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
