package com.egg.start.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "author")
@SQLDelete(sql = "UPDATE `author` a SET deleted = true WHERE id_author = ?") // This is created for the soff deleted in
																				// the BD
@Where(clause = "deleted = false")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class AuthorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_author;
	@NotEmpty
	private String name;
	private Boolean deleted = Boolean.FALSE;
}
