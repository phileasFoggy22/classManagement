package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.ClassroomRepository;

public class ClassroomImplementation implements ClassroomService {

	@Inject
	private ClassroomRepository classRepo;

	@Override
	public String createClassroom(String classroomJSON) {

		return classRepo.createClassroom(classroomJSON);
	}

	@Override
	public String getClassrooms() {

		return classRepo.getClassrooms();
	}

}
