# Employee Management API
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Description
This project is a Spring Boot application for managing employees. It allows adding, updating, deleting, and retrieving employees via a REST API. The data is stored in an in-memory H2 database.

## Metadata
- **Group**: com.eduardoschoepf
- **Artifact**: api

## Features
- **Add Employee**: Create a new employee.
- **Update Employee**: Update an existing employee's information.
- **Delete Employee**: Remove an employee.
- **Retrieve Employees**: Get details of all employees or a specific employee.

## Dependencies
The main dependencies used in this project are:
- **Spring Web**: For building the REST API.
- **Lombok**: To reduce boilerplate code (getters, setters, constructors, etc.).
- **H2 Database**: For a lightweight, in-memory database.
- **Spring Data JPA**: To simplify database interactions.

The application will be available at `http://localhost:9000`.

## API Usage
Here are the main API endpoints:

- **GET /employees**: Retrieves the list of all employees.
- **GET /employee/{id}**: Retrieves details of an employee by ID.
- **DELETE /employee/{id}**: Deletes an employee by ID.

## H2 Database Configuration
The H2 database is configured to run in memory. You can access the H2 console at `http://localhost:8080/h2-console` with the following details:
- **JDBC URL**: `jdbc:h2:mem:employees`
- **Username**: `sa`
- **Password**: (leave blank)

## Lombok
Lombok is used to automatically generate getter, setter, and other useful methods in the entities. Make sure to have the Lombok plugin installed in your IDE to avoid compilation errors.
