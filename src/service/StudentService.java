package com.maiora.student.service;

import java.util.List;

import com.maiora.student.entity.Student;
import com.maiora.student.request.StudentRequest;



public interface StudentService {

	Student save(StudentRequest studentRequest);
	
	
	List<Student> getFilteredStudents();
}
