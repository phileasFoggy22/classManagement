package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomImplementation implements ClassroomService {

	@Inject
	private ClassroomRepository classRepo;

	@Override
	public String createClassroom(String classroomJSON) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getClassrooms() {
		// TODO Auto-generated method stub
		return null;
	}

}
