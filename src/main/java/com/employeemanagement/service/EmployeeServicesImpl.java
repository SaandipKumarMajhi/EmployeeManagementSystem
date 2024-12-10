package com.employeemanagement.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.Exception.ResourceNotFoundException;
import com.employeemanagement.model.Employee;
import com.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee createEmployee(Employee employee) {
		Random random = new Random();
		int userId = random.nextInt(1, 100);
		employee.setId(userId);
		return repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return repository.findAll();
	}

	@Override
	public Employee getById(Integer employeeId) {
		return repository.findById(employeeId).orElseThrow(
				() -> new ResourceNotFoundException(employeeId + " :-This Id is not present!!Please enter valid ID"));
	}

	@Override
	public Employee updateEmployee(Integer employeeId,Employee employee) {
		
		if (repository.existsById(employeeId) == true) {
			if(employee.getId()==employeeId) {
				String name=employee.getEmpName();
				String address=employee.getEmpAddress();
				Long mobNo= employee.getEmpMobNo();
				Double yearOfExperience= employee.getEmpYOE();
				
				employee.setEmpName(name);
				employee.setEmpAddress(address);
				employee.setEmpMobNo(mobNo);
				employee.setEmpYOE(yearOfExperience);
				repository.save(employee);

			}else {
				throw new ResourceNotFoundException("You Can not create new Data");
			}
			
		}else {
			throw new ResourceNotFoundException("Id is not Valid");
		}
		
		return employee;
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		repository.deleteById(employeeId);
		return "Successfully deleted";
	}

}
