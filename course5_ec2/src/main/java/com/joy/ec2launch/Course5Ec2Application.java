package com.joy.ec2launch;

import java.time.LocalDate;

import com.joy.ec2launch.entities.Emp;
import com.joy.ec2launch.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Course5Ec2Application {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Course5Ec2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		CommandLineRunner runner = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Emp e1 = new Emp();
				e1.setName("Brian");
				e1.setAddress("Houston");
				e1.setDateOfJoin(LocalDate.of(2020, 05, 11));
				
				Emp e2 = new Emp();
				e2.setName("Charles");
				e2.setAddress("Los Angeles");
				e2.setDateOfJoin(LocalDate.of(2021, 04, 6));
				
				Emp e3 = new Emp();
				e3.setName("Harry");
				e3.setAddress("Chicago");
				e3.setDateOfJoin(LocalDate.of(2022, 07, 9));
				
				employeeRepository.save(e1);
				employeeRepository.save(e2);
				employeeRepository.save(e3);
			}
		};
		return runner;
	}
}
