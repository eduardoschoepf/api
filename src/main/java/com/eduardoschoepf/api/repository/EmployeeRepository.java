package com.eduardoschoepf.api.repository;

import com.eduardoschoepf.api.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Annotation Spring pour indiquer que la classe est un bean, et que son rôle est de communiquer avec une source de données
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
