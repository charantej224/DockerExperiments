package com.charan.employee.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
 
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	@JsonProperty("Emp")
	private long empId;
 
	@JsonProperty("Emp_name")
	@Column(name = "emp_name")
	private String empName;
 
	@JsonProperty("Emp_department")
	@Column(name = "dept_id")
	private long deptId;
 
	public Employee() {
	}
 
	public Employee(long empId,String empName, long deptId) {
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
	}
 
	
}
