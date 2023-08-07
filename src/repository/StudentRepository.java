package com.maiora.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maiora.student.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

	
	
	
	List<Student> findByAgeBetween(int start_age,int end_age);
}
