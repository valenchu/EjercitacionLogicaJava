package com.egg.start.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@SQLDelete(sql = "UPDATE `book` b SET deleted = true WHERE id = ?") // This is created for the soff deleted in the
																	// // // BD
@Where(clause = "deleted = false")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer", "FieldHandler" })
public class BookEntity extends BaseEntityPersona {

	@NotNull
	@Min(value = 1)
	private Long isbn;
	@NotEmpty
	@NotNull
	private String title;
	@Min(value = 1)
	@NotNull
	private Integer year;
	@Min(value = 1)
	@NotNull
	private Integer copie;
	@Min(value = 1)
	@NotNull
	private Integer provaideCopie;
	@Min(value = 1)
	@NotNull
	private Integer remainingCopie;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	private AuthorEntity author = new AuthorEntity();
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "editorial_id")
	private EditorialEntity editorial = new EditorialEntity();
	private Boolean deleted = Boolean.FALSE;

}
