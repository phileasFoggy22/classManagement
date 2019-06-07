package com.qa.business.service;

public interface ClassroomService {

	String createClassroom(String classroomJSON);

	String getClassrooms();

	int countClassrooms();

	String deleteClassroom(int classID);

	String updateClassroom(int classID, String classroomJSON);

	String getClassroom(int classID);
}
