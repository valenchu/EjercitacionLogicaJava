package com.egg.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egg.start.entity.AuthorEntity;
@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, String> {

}
