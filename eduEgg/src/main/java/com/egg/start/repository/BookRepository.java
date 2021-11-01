package com.egg.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egg.start.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String>{

}
