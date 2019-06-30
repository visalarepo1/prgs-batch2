package com.prgs.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prgs.school.model.Student;
import com.prgs.school.services.StudentService;


@RestController
public class StudentsController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("/listAllStudents")
	public List<Student> getClassRoomsNameDoesntMatter() {
		return studentService.getAllStudents();
	}

	@PostMapping("/new-student-form")
	public Student addNewStudentWithForm(@ModelAttribute Student newStudent) {		
		studentService.save(newStudent);
		return newStudent;
	}
	
	@PostMapping(name="/new-student-json", consumes="application/json", produces="application/json")
	public Student addNewStudentWithJson(@RequestBody Student newStudent) {		
		studentService.save(newStudent);
		return newStudent;
	}
}
