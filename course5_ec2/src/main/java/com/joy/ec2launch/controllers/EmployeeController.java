package com.joy.ec2launch.controllers;

import java.time.LocalDateTime;
import java.util.List;

import com.joy.ec2launch.entities.Emp;
import com.joy.ec2launch.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Emp> getEmployees()
	{
		return employeeRepository.findAll();
	}
	
	@GetMapping("/")
	public String HomePage() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return "Welcome to Home Page! This page is viewed on AWS at " + localDateTime;
	}
	
	@GetMapping("/warn")
    public String WarnPage(){
        return "Welcome to warn page";
    }

    @GetMapping("/er")
    public String ErrorPage(){
        return "Welcome to error page";
    }
}
