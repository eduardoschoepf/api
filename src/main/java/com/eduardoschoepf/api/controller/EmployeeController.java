package com.eduardoschoepf.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardoschoepf.api.model.Employee;
import com.eduardoschoepf.api.service.EmployeeService;

@RestController // Indique à Spring d’insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}