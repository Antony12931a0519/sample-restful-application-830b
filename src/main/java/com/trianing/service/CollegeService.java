package com.trianing.service;

import java.util.List;

import com.trianing.dao.CollegeDAO;
import com.trianing.models.College;

public class CollegeService {
	// creation of object
	CollegeDAO collegeDao = new CollegeDAO();

	public List<College> getCollegesList() {

		List<College> list = collegeDao.getCollegesList();

		return list;
	}

}
