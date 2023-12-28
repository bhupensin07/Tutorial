package com.example.Service1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Service1.model.Student;
import com.example.Service1.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

}
