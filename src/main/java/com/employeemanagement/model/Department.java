package com.employeemanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer deparmentId;
	@Column(name = "departmentname")
	private String departmentName;

	public int getdeparmentId() {
		return deparmentId;
	}

	public void setdeparmentId(Integer deparmentId) {
		this.deparmentId = deparmentId;
	}

	public String getdepartmentName() {
		return departmentName;
	}

	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [deparmentId=" + deparmentId + ", departmentName=" + departmentName + "]";
	}

}
