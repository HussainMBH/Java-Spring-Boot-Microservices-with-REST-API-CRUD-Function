package com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.configuration;

import com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.repository.EmployeeRepo;
import com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public EmployeeService employeeBean(){
        return new EmployeeService();
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
