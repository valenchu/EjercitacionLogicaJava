package com.egg.start.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseMapper {
	@Autowired
	private ModelMapper mapper;

	/*
	 * Method that mapper a dtoList to list entity
	 */
	public <S, T> List<T> mapList(List<S> source, Class<T> targetClass) {
		return source.stream().map(element -> mapper.map(element, targetClass)).collect(Collectors.toList());
	}

}
