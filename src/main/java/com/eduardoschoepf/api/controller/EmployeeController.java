package com.eduardoschoepf.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardoschoepf.api.model.Employee;
import com.eduardoschoepf.api.service.EmployeeService;

//Indique à Spring d’insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP
@RestController 
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}