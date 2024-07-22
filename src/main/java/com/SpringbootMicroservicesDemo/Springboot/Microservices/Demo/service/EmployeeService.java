package com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.service;

import com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.entity.Employee;
import com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.repository.EmployeeRepo;
import com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;

import java.util.Optional;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    public EmployeeResponse getEmployeeById(int id){
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }
}
