package com.qa.persistence.repository;

import java.util.Map;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

public class ClassroomMapRepo implements ClassroomRepository {

	private Map<Integer, Classroom> classes;

	public String getClassrooms() {
		return new JSONUtil().getJSONForObject(this.classes);
	}

	public ClassroomMapRepo(Map<Integer, Classroom> classAttendees) {
		super();
		this.classes = classAttendees;

	}

	public Map<Integer, Classroom> getClassAttendees() {
		return classes;
	}

	public void setClassAttendees(Map<Integer, Classroom> classAttendees) {
		this.classes = classAttendees;
	}

	public String createClassroom(String classroomJSON) {

		Classroom class1 = new JSONUtil().getObjectForJSON(classroomJSON, Classroom.class);

		this.getClassAttendees().put(class1.getClassroomID(), class1);
		return classroomJSON;
	}

}
