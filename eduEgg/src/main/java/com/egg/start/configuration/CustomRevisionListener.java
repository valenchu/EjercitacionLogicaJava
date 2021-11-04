package com.egg.start.configuration;

import org.hibernate.envers.RevisionListener;

import com.egg.start.entity.audit.Revision;


public class CustomRevisionListener implements RevisionListener {

	@Override
	public void newRevision(Object revisionEntity) {
		final Revision revision = (Revision) revisionEntity;
	}

}
