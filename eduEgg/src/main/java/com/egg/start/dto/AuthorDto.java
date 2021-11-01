package com.egg.start.dto;


import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
	
	@NotEmpty
	private String name;
	private Boolean deleted = Boolean.FALSE;
}
