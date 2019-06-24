package com.prgs.school.services;

import java.util.ArrayList;
import java.util.List;

import com.prgs.school.model.Student;



public class StudentService {

	public List<Student> getAllStudents() {
		List<Student> sa =new ArrayList<Student>();
		 sa.add(new Student("ram"));
		 sa.add(new Student("sita"));
		return sa;
	}

}