package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.ClassroomService;

@Path(value = "/classroom")
public class ClassroomEndpoint {
	@Inject
	private ClassroomService service;

	@Path("/getClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getClassrooms() {
		return service.getClassrooms();
	}

	@Path("/createClassroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String classroomJSON) {
		return service.createClassroom(classroomJSON);
	}

	@Path("/deleteClassroom/{classID}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("classID") int classID) {
		return service.deleteClassroom(classID);
	}

	@Path("/updateClassroom/{classID}")
	@PUT
	@Produces({ "application/json" })
	public String updateAccount(@PathParam("classID") int classID, String classroomJSON) {
		return service.updateClassroom(classID, classroomJSON);
	}

	@Path("/countClassrooms")
	@GET
	@Produces({ "application/json" })
	public int countClassrooms() {
		return service.countClassrooms();
	}

	@Path("/getClassrooms/{classID}")
	@GET
	@Produces({ "application/json" })
	public String getClassroom(@PathParam("classID") int classID) {
		return service.getClassroom(classID);
	}
}
