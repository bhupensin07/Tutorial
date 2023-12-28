package com.example.Service1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Service1.model.Student;
import com.example.Service1.service.StudentService;

@RestController
@RequestMapping("/service1")
public class Service1Controller {

	@Autowired
	private StudentService service;
	
	@GetMapping("/hello")
	public String getHello1()
	{
		return "Service1 Running...";
	}
	@GetMapping("/webClientHello")
	public String getWebHello1()
	{
		return "Service1 Running web...";
	}
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student request) {
        return service.saveStudent(request);
	}
	
	
}
