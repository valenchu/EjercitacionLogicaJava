package com.egg.start.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.egg.start.entity.BookEntity;

@Repository
public interface BookRepository extends BaseRepository<BookEntity, Long>{
	
	

}
