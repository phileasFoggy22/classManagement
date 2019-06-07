package com.qa.persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class ClassroomDBRepo implements ClassroomRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@PersistenceContext
	public void setEntityManager(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public String getClassrooms() {
		TypedQuery<Classroom> query = manager.createQuery("SELECT c FROM Classroom c", Classroom.class);
		return util.getJSONForObject(query.getResultList());
	}

	@Override
	@Transactional(TxType.REQUIRED)
	public String createClassroom(String classroomJSON) {
		Classroom class1 = util.getObjectForJSON(classroomJSON, Classroom.class);
		this.manager.persist(class1);
		return "{\"message\": \"classroom sucessfully added\"}";
	}

	@Override
	public int countClassrooms() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Transactional(TxType.REQUIRED)
	public String deleteClassroom(int classID) {
		Classroom class1 = manager.find(Classroom.class, classID);
		manager.remove(class1);
		return "{\"message\": \"classroom sucessfully removed\"}";

	}

	@Override
	@Transactional(TxType.REQUIRED)
	public String updateClassroom(int classID, String classroomJSON) {
		Classroom class1 = util.getObjectForJSON(classroomJSON, Classroom.class);
		Classroom updateThisClassroom = manager.find(Classroom.class, classID);
		updateThisClassroom.setTrainer(class1.getTrainer());
		updateThisClassroom.setTrainees(class1.getTrainees());
		manager.persist(updateThisClassroom);
		return "{\"message\": \"classroom sucessfully updated\"}";

	}

	@Override
	public String getClassroom(int classID) {
		Classroom class1 = manager.find(Classroom.class, classID);
		return util.getJSONForObject(class1);
	}

}
