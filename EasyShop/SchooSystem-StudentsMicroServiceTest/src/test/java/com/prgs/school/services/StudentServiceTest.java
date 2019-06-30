
package com.prgs.school.services;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prgs.school.model.Student;

public class StudentServiceTest {
	StudentService service;
	
	@BeforeAll
	public static void initialSetupForAllTests() {
		
	}
	
	@BeforeEach
	public void testSetupForEveryTest() {
	 service = new StudentService();
	}
	
	@AfterEach
	public void afterEachTest() {
		
	}
	
	@AfterAll
	public static void onceAfterAllTestsAreRun() {
		
	}
	
	@Test
	public void getAllStudentsShouldReturnEmptyForFirstTime() {
		List<Student> studentsList = service.getAllStudents();
		assertEquals(0, studentsList.size());
	}
	
	@Test
	public void getAllStudentsAfterSaveShouldReturnSameStudent() {
		Student newStudent = new Student();
		newStudent.setName("new student");
		service.save(newStudent );
		
		List<Student> studentsList = service.getAllStudents();
		assertEquals(1, studentsList.size());
		assertEquals("new student", studentsList.get(0).getName());
	}
}