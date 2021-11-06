package com.egg.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.egg.start.entity.EditorialEntity;

@Repository
public interface EditorialRepository extends JpaRepository<EditorialEntity, Long> {

}
