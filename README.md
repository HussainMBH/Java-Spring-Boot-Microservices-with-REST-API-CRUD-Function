Microservices is an architectural approach to build a collection of logic, data layers, and loosely coupled applications. 
Every microservices deals with one business function end-to-end independently from other microservices. 
Microservices present simple and understandable APIs to communicate with each other through lightweight common protocols such as HTTP. 
With the increasing demand for Microservices Architecture Patterns in the industry the popularity of Spring Boot is also increasing because when it comes to Microservices Development, Spring Boot is the first choice of every developer. 
Spring Boot is a microservice-based framework that makes a production-ready application in significantly less time. By using Spring Boot, you can make your microservices smaller and it will run faster. 
For this reason, Spring Boot has become the standard for Java microservices. 
In this article, we will create a simple Microservice using Spring Boot.

# Employee Microservice with Spring Boot - README

## Overview
This project demonstrates how to build a simple Employee Microservice using Java and Spring Boot. The microservice fetches employee data from a MySQL database and provides an endpoint to retrieve employee details by ID.

## Prerequisites
- Java 17
- Maven
- MySQL
- IntelliJ IDEA or any other IDE

## Steps to Set Up the Project

### Step 1: Create a New Spring Boot Project
1. Use [Spring Initializr](https://start.spring.io/) to create a new Spring Boot project.
2. Select the following options:
    - Project: Maven
    - Language: Java
    - Packaging: Jar
    - Java: 17
3. Add the following dependencies:
    - Spring Boot DevTools
    - Spring Data JPA
    - MySQL Driver
    - Spring Web
4. Generate the project and import it into your IDE (e.g., IntelliJ IDEA).

### Step 2: Configure MySQL Database
1. Create a schema named `gfgmicroservicesdemo` in MySQL Workbench.
2. Create a table named `employee` with the columns `id`, `name`, `email`, and `age`.
3. Insert some sample data into the table.

### Step 3: Update `application.properties`
1. Update the `application.properties` file with your MySQL database connection details.
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/gfgmicroservicesdemo
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

### Step 4: Create Entity/Model Class
1. Create a class `Employee` in the `entity` package to represent the employee table.

### Step 5: Create Repository Interface
1. Create an interface `EmployeeRepo` in the `repository` package extending `JpaRepository`.

### Step 6: Create Response Class
1. Create a class `EmployeeResponse` in the `response` package to format the response data.

### Step 7: Create Service Class
1. Create a class `EmployeeService` in the `service` package to handle business logic.
2. Implement a method to fetch employee details by ID using `EmployeeRepo`.

### Step 8: Create Controller Class
1. Create a class `EmployeeController` in the `controller` package.
2. Define an endpoint `GET /employees/{id}` to retrieve employee details by ID.

### Step 9: Create Configuration Class
1. Create a class `EmployeeConfig` in the `configuration` package.
2. Define beans for `EmployeeService` and `ModelMapper`.

### Step 10: Run the Microservice
1. Run the application by executing the main class (`EmployeeServiceApplication`).

### Step 11: Test the Endpoint
1. Use Postman or any other API testing tool.
2. Send a GET request to `http://localhost:8080/employees/1`.
3. Verify the response contains the employee details.

## Dependencies
Ensure your `pom.xml` contains the necessary dependencies for Spring Boot, MySQL, JPA, and ModelMapper.