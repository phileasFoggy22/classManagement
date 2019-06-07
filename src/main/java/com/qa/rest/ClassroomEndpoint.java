package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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

	@Path("/Classroom")
	@POST
	@Produces({ "application/json" })
	public String createClassroom(String classroomJSON) {
		return service.createClassroom(classroomJSON);
	}
}
