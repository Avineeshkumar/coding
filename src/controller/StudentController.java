package com.maiora.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maiora.student.entity.Student;
import com.maiora.student.request.StudentRequest;
import com.maiora.student.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	
	@PostMapping("/add")
	public Student save(@RequestBody StudentRequest studentRequest) {
		
		Student student = studentService.save(studentRequest);
		return student;
	}

	@GetMapping(path = "/getFilteredStudents")
	public List<Student> getFilteredStudents() {

		return studentService.getFilteredStudents();
	}
	
}
