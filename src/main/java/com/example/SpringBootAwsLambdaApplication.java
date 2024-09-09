package com.example;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootAwsLambdaApplication {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsLambdaApplication.class, args);
	}

	@Bean
	public Supplier<List<Employee>> employees()
	{
		return ()-> employeeRepository.getEmployees();
	}

	@Bean
	public Function<APIGatewayProxyRequestEvent, List<Employee>> findEmployeeByName(){
		return (requestEvent) -> employeeRepository.getEmployees().stream().filter(emp -> emp.getName().equals(requestEvent.getQueryStringParameters().get("employeeName"))).collect(Collectors.toList());
	}
	
}
