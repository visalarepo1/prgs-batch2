package com.prgs.school.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prgs.school.model.Student;
import com.prgs.school.services.StudentService;


@RestController
public class StudentsController {

	
	 @GetMapping("/listAllStudents")
	 public List<Student> getClassRoomsNameDoesntMatter() {
		 
		 StudentService studentService = new StudentService();
		return studentService.getAllStudents();
		 
	 }
}
