package com.egg.start.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Data
@SQLDelete(sql = "UPDATE `book` b SET deleted = true WHERE id_book = ?") // This is created for the soff deleted in the
																			// BD
@Where(clause = "deleted = false")
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_book;
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
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id", referencedColumnName = "id_author")
	private AuthorEntity author;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "editorial_id", referencedColumnName = "id_editorial")
	private EditorialEntity editorial;
	private Boolean deleted = Boolean.FALSE;

}
