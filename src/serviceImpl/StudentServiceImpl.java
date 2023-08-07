package com.maiora.student.serviceImpl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maiora.student.entity.Student;
import com.maiora.student.repository.StudentRepository;
import com.maiora.student.request.StudentRequest;
import com.maiora.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public Student save(StudentRequest studentRequest) {
		
		LocalDate dob = LocalDate.of(studentRequest.getYear(), studentRequest.getMonth(), studentRequest.getDate());
		
		LocalDate now = LocalDate.now();
		
		
		Period period = Period.between(dob, now);
		
		Student student = new Student();
		
		student.setName(studentRequest.getName());
		
		student.setAge(period.getYears());
		
		
		return studentRepository.save(student);
	}
	
	
	@Override
	public List<Student> getFilteredStudents(){
		
		List<Student> students = studentRepository.findByAgeBetween(18,25);
		
		return students;
	}
	
}
