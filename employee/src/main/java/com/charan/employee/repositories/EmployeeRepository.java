package com.charan.employee.repositories;

import org.springframework.data.repository.CrudRepository;

import com.charan.employee.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
}
