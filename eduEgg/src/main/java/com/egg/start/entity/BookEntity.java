package com.egg.start.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@SQLDelete(sql = "UPDATE `book` b SET deleted = true WHERE id_book = ?") // This is created for the soff deleted in the
																			// // // BD
@Where(clause = "deleted = false")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class BookEntity {
	@Id
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
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	private AuthorEntity author;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "editorial_id")
	private EditorialEntity editorial;
	private Boolean deleted = Boolean.FALSE;

}
