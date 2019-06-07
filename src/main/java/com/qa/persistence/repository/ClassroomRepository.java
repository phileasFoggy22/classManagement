package com.qa.persistence.repository;

public interface ClassroomRepository {
	String getClassrooms();

	String createClassroom(String class1);

	int countClassrooms();

	String deleteClassroom(int classID);

	String updateClassroom(int classID, String class1);

	String getClassroom(int classID);

}
