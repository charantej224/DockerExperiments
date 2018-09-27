package com.charan.employee.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charan.employee.models.Employee;
import com.charan.employee.repositories.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;

	@GetMapping("/getEmployees")
	public Employee getEmployees() {
	
		
		Employee emp = empRepo.findById(1111L).orElse(new Employee());
		return emp;
		
//
//		String sql = "Select * from employee";
//
//		Statement statement = postgresDataSource.getConnection().createStatement();
//		ResultSet rs = statement.executeQuery(sql);
//		while (rs.next()) {
//			System.out.println(rs.getInt("emp_id"));
//			System.out.println(rs.getString("emp_name"));
//			System.out.println(rs.getInt("dept_id"));
//
//		}
//
//		rs.close();
//		statement.close();
//
//		String returnData = "success";
//
//		return returnData;

	}

}
