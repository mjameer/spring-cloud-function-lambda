package com.example;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.example.entity.Employee;


public class EmployeeHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, List<Employee>> {

}
