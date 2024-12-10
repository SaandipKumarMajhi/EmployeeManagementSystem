package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServices services;
	
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		Employee createEmployee = services.createEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(createEmployee);
	}
	
	@GetMapping("/allEmployee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> allEmployee = services.getAllEmployee();
		return ResponseEntity.ok(allEmployee);
	}
	
	@GetMapping("/id/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId){
		Employee byId = services.getById(empId);
		return ResponseEntity.ok(byId);
	}
	
	@PutMapping("/update/id/{empId}")
	public ResponseEntity<String> updateEmployee(@PathVariable Integer empId,@RequestBody Employee employee){
		 services.updateEmployee(empId, employee);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Updated Successfully");
	}
	
	@DeleteMapping("/deleteEmployee/{empId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable Integer empId) {
		String deleteEmployee = services.deleteEmployee(empId);
		return ResponseEntity.ok(deleteEmployee);
	}

}
