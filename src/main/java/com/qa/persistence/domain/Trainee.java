package com.qa.persistence.domain;

public class Trainee {

	private int traineeID;
	private String traineeName;

	public Trainee(int traineeID, String traineeName) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
	}

	public int getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}
