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

	@Override
	public int countClassrooms() {
		return classRepo.countClassrooms();
	}

	@Override
	public String deleteClassroom(int classID) {
		return classRepo.deleteClassroom(classID);
	}

	@Override
	public String updateClassroom(int classID, String classroomJSON) {
		return classRepo.updateClassroom(classID, classroomJSON);
	}

	@Override
	public String getClassroom(int classID) {
		return classRepo.getClassroom(classID);
	}

}
