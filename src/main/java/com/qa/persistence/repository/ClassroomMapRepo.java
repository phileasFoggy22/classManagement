package com.qa.persistence.repository;

import java.util.Map;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

public class ClassroomMapRepo implements ClassroomRepository {

	private Map<Integer, Classroom> classes;

	@Override
	public String getClassrooms() {
		return new JSONUtil().getJSONForObject(this.classes);
	}

	public ClassroomMapRepo(Map<Integer, Classroom> classAttendees) {
		super();
		this.classes = classAttendees;

	}

	@Override
	public String createClassroom(String classroomJSON) {

		Classroom class1 = new JSONUtil().getObjectForJSON(classroomJSON, Classroom.class);

		this.classes.put(class1.getClassroomID(), class1);
		return "Class Added";
	}

	@Override
	public int countClassrooms() {
		return this.classes.size();
	}

	@Override
	public String deleteClassroom(int classID) {
		this.classes.remove(classID);
		return "Class Removed";
	}

	@Override
	public String updateClassroom(int classID, String classroomJSON) {
		Classroom class1 = new JSONUtil().getObjectForJSON(classroomJSON, Classroom.class);
		this.classes.put(classID, class1);
		return "Class Updated";
	}

	@Override
	public String getClassroom(int classID) {

		return new JSONUtil().getJSONForObject(this.classes.get(classID));
	}

}
