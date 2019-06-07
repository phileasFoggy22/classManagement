package com.qa.persistence.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

public class ClassroomDBRepo implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	public String getClassrooms() {
		TypedQuery<Classroom> query = manager.createQuery("SELECT c FROM Classroom c", Classroom.class);
		return util.getJSONForObject(query.getResultList());
	}

	@Override
	public String createClassroom(String class1) {
		// TODO Auto-generated method stub
		return null;
	}

}
