package com.egg.start.entity.audit;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.egg.start.configuration.CustomRevisionListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * This Class generate an audity of entity in the BD
 * there is created a clas denominated CustomRevisionListener in the
 * Configuration
 * Add @Audited in the class entity with you want audited
 * 
 * */
@Entity
@Table(name = "REVISION_INFO")
@RevisionEntity(CustomRevisionListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Revision implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
	@SequenceGenerator(name = "revision_seq", sequenceName = "rbac.seq_revision_id")
	@RevisionNumber
	private Long id;
	@DateTimeFormat
	@RevisionTimestamp
	private Date date;

}
