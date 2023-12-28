package com.example.Service1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Service1.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
