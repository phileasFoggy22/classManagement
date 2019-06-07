package com.qa.persistence.domain;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private int classroomID;
	private String trainer;
	private List<Trainee> trainees = new ArrayList<Trainee>();

	public Classroom(int classroomID, String trainer, List<Trainee> trainees) {
		super();
		this.classroomID = classroomID;
		this.trainer = trainer;
		this.trainees = trainees;
	}

	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

}
