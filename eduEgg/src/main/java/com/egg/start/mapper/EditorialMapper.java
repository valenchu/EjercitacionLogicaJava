package com.egg.start.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditorialMapper extends BaseMapper {
	@Autowired
	private ModelMapper mapper;

}
