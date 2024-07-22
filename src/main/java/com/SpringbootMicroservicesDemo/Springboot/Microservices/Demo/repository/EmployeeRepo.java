package com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.repository;

import com.SpringbootMicroservicesDemo.Springboot.Microservices.Demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
