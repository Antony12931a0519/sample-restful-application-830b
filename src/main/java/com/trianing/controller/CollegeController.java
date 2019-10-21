package com.trianing.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.trianing.models.College;
import com.trianing.service.CollegeService;

@Path("/colleges")
public class CollegeController {
	CollegeService collegeService = new CollegeService();

	@Path("/list")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<College> getCollegesList() {

		List<College> list = collegeService.getCollegesList();

		return list;
	}

	@Path("/1")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public College addCollege() {

		return null;
	}

}
