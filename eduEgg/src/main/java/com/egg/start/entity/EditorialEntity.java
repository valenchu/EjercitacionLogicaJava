package com.egg.start.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "editorial")
@SQLDelete(sql = "UPDATE `editorial` e SET deleted = true WHERE id = ?") // This is created for the soff deleted in the
																			// BD
@Where(clause = "deleted = false")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditorialEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id_editorial;
	@NotEmpty
	private String name;
	private Boolean deleted = Boolean.FALSE;

}
