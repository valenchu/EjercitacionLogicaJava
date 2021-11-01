package com.egg.start.dto;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

	@NotNull
	@NotEmpty
	@Min(value = 1)
	private Long isbn;
	@NotEmpty
	private String title;
	@Min(value = 1)
	@NotEmpty
	private Integer year;
	@Min(value = 1)
	@NotEmpty
	private Integer copie;
	@Min(value = 1)
	@NotEmpty
	private Integer provaideCopie;
	@Min(value = 1)
	@NotEmpty
	private Integer remainingCopie;

	private AuthorDto author;
	private EditorialDto editorial;
	private Boolean deleted = Boolean.FALSE;

}
