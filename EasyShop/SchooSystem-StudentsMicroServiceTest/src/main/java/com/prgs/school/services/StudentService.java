package com.prgs.school.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prgs.school.model.Student;



@Service
public class StudentService {
	
	// not thread safe
	List<Student> studentsList= new ArrayList<Student>();
	
	public List<Student> getAllStudents() {
		return studentsList;
	}

	// Can lead to concurrency issues due to state(studentsList)
	public void save(Student newStudent) {
		studentsList.add(newStudent);
	}

}

