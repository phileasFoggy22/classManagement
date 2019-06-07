package com.qa.MapTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.domain.Trainee;
import com.qa.persistence.repository.ClassroomMapRepo;
import com.qa.persistence.repository.ClassroomRepository;
import com.qa.util.JSONUtil;

public class TraineeTest {

	private ClassroomRepository ClassroomRepo;
	private List<Trainee> class1Attendees;
	private List<Trainee> class2Attendees;
	private Classroom class1;
	private Classroom class2;

	@Before
	public void start() {
		ClassroomRepo = new ClassroomMapRepo(new HashMap<Integer, Classroom>());
		class1Attendees = new ArrayList<Trainee>();
		class1Attendees.add(new Trainee(1, "Joe Bloggs"));
		class1Attendees.add(new Trainee(2, "Jane Bloggs"));

		class1 = new Classroom(0, "Matt Hunt", class1Attendees);
		ClassroomRepo.createClassroom(new JSONUtil().getJSONForObject(class1));
	}

	@Test
	public void getAllClasses() {
		assertEquals(
				"{\"0\":{\"classroomID\":0,\"trainer\":\"Matt Hunt\",\"trainees\":[{\"traineeID\":1,\"traineeName\":\"Joe Bloggs\"},{\"traineeID\":2,\"traineeName\":\"Jane Bloggs\"}]}}",
				ClassroomRepo.getClassrooms());
	}

}
