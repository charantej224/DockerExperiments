package com.charan.department.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charan.department.model.Department;

@RestController
public class DepartmentController {
	
	@GetMapping("/getDepartments")
	public List<Department> getDepartments(){
		List<Department> departments = new ArrayList<Department>();
		Department department1 = new Department();
		department1.setDepartmentName("Retail Banking");
		department1.setDepartmentNumber("100");
		
		Department department2 = new Department();
		department2.setDepartmentName("Commercial Banking");
		department2.setDepartmentNumber("101");
		
		departments.add(department1);
		departments.add(department2);
		
		return departments;
		
	}

}
