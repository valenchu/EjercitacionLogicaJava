package com.egg.start.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name = "author")
@SQLDelete(sql = "UPDATE `author` a SET deleted = true WHERE id = ?") // This is created for the soff deleted in
																				// // the BD
@Where(clause = "deleted = false")
@Data
@Audited
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer", "FieldHandler" })
public class AuthorEntity extends BaseEntityPersona {
	
}
