// package com.qa.MapTest;
//
// import static org.junit.Assert.assertEquals;
//
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
//
// import org.junit.Before;
// import org.junit.Test;
//
// import com.qa.persistence.domain.Classroom;
// import com.qa.persistence.domain.Trainee;
// import com.qa.persistence.repository.ClassroomMapRepo;
// import com.qa.persistence.repository.ClassroomRepository;
// import com.qa.util.JSONUtil;
//
// public class TraineeTest {
//
// private ClassroomRepository classroomRepo;
// private List<Trainee> class1Attendees;
// private List<Trainee> class2Attendees;
// private Classroom class1;
// private Classroom class2;
//
// @Before
// public void start() {
// classroomRepo = new ClassroomMapRepo(new HashMap<Integer, Classroom>());
// class1Attendees = new ArrayList<Trainee>();
// class1Attendees.add(new Trainee(1, "Joe Bloggs"));
// class1Attendees.add(new Trainee(2, "Jane Bloggs"));
// class2 = new Classroom(1, "Chester Gardner", class1Attendees);
// class1 = new Classroom(0, "Matt Hunt", class1Attendees);
// classroomRepo.createClassroom(new JSONUtil().getJSONForObject(class1));
// }
//
// @Test
// public void getAllClasses() {
// assertEquals(
// "{\"0\":{\"classroomID\":0,\"trainer\":\"Matt
// Hunt\",\"trainees\":[{\"traineeID\":1,\"traineeName\":\"Joe
// Bloggs\"},{\"traineeID\":2,\"traineeName\":\"Jane Bloggs\"}]}}",
// classroomRepo.getClassrooms());
// }
//
// @Test
// public void addClass() {
// assertEquals(1, classroomRepo.countClassrooms());
//
// classroomRepo.createClassroom(new JSONUtil().getJSONForObject(class2));
// assertEquals(2, classroomRepo.countClassrooms());
// }
//
// @Test
// public void deleteClass() {
// assertEquals(1, classroomRepo.countClassrooms());
// classroomRepo.deleteClassroom(0);
// assertEquals(0, classroomRepo.countClassrooms());
// }
//
// @Test
// public void getClassroom() {
// assertEquals(
// "{\"classroomID\":0,\"trainer\":\"Matt
// Hunt\",\"trainees\":[{\"traineeID\":1,\"traineeName\":\"Joe
// Bloggs\"},{\"traineeID\":2,\"traineeName\":\"Jane Bloggs\"}]}",
// classroomRepo.getClassroom(0));
// }
//
// @Test
// public void updateClassroom() {
// classroomRepo.updateClassroom(0, new JSONUtil().getJSONForObject(class2));
// assertEquals(
// "{\"classroomID\":1,\"trainer\":\"Chester
// Gardner\",\"trainees\":[{\"traineeID\":1,\"traineeName\":\"Joe
// Bloggs\"},{\"traineeID\":2,\"traineeName\":\"Jane Bloggs\"}]}",
// classroomRepo.getClassroom(0));
// }
//
// @Test
// public void newTrainees() {
//
// class2Attendees = new ArrayList<Trainee>();
// class2Attendees.add(new Trainee(1, "David Bloggs"));
// class2Attendees.add(new Trainee(2, "Ceri Bloggs"));
// class2 = new Classroom(1, "Chester Gardner", class2Attendees);
// classroomRepo.updateClassroom(0, new JSONUtil().getJSONForObject(class2));
// assertEquals(
// "{\"classroomID\":1,\"trainer\":\"Chester
// Gardner\",\"trainees\":[{\"traineeID\":1,\"traineeName\":\"David
// Bloggs\"},{\"traineeID\":2,\"traineeName\":\"Ceri Bloggs\"}]}",
// classroomRepo.getClassroom(0));
// }
//
// }
