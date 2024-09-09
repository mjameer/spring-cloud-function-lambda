package com.example.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public class EmployeeRepository {

	public List<Employee> getEmployees(){
		
		return Stream.of(new Employee(100,"Ram",8978),
				         new Employee(103,"Venkat",7898),
				         new Employee(278,"Chennai",6756),
				         new Employee(953,"John",9870))
				.collect(Collectors.toList());
	}
}
