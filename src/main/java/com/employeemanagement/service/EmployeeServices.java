package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.model.Employee;

public interface EmployeeServices {
	
	Employee createEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getById(Integer employeeId);
	
	Employee updateEmployee(Integer employeeId,Employee employee);
	
	String deleteEmployee(Integer employeeId);

}
