package com.trianing.dao;

import java.util.ArrayList;
import java.util.List;

import com.trianing.models.College;

public class CollegeDAO {

	public  List<College> getCollegesList() {

		List<College> collesesList = new ArrayList<College>();
		College college = new College();
		college.setCollegeName("Abc");
		college.setCity("Hyd");

		collesesList.add(college);

		College college1 = new College();
		college1.setCollegeName("Def");
		college1.setCity("Hyd");

		collesesList.add(college1);

		return collesesList;
	}

}
