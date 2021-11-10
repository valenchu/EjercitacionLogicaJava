package com.egg.start.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.egg.start.entity.BaseEntityPersona;

@NoRepositoryBean//this label avoid create instance of this interface
public interface BaseRepository <E extends BaseEntityPersona, ID> extends JpaRepository<E, ID>{
	
	

}
