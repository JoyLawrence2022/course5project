package com.joy.ec2launch.repositories;

import com.joy.ec2launch.entities.Emp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Emp, Integer>{

}
