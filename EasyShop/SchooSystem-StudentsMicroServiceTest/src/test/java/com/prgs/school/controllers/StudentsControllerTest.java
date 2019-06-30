
package com.prgs.school.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.ParentRunner;
import org.junit.runners.model.FrameworkMethod;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.prgs.school.model.Student;
import com.prgs.school.services.StudentService;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentsController.class)

public class StudentsControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private StudentService service;

	@Test
	public void listAllStudentsShouldGETAllStudents() throws Exception {
		Student s1 = new Student();
		s1.setName("S1");
		List<Student> allStudents = new ArrayList<>();
		allStudents.add(s1);

		Mockito.when(service.getAllStudents()).thenReturn(allStudents);

		mvc.perform(get("/listAllStudents").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$[0].name", is(s1.getName())));
	}
}