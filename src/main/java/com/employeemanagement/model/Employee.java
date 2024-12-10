package com.employeemanagement.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name",length = 50)
	private String empName;
	@Column(name="address")
	private String empAddress;
	@Column(name="mobno")
	private Long empMobNo;
	@Column(name="yearofexperience")
	private Double empYOE;
	
	@OneToMany
	@Transient
	private Department department;

//	public Employee(String empName, String empAddress, Long empMobNo, Double empYOE, Integer id) {
//
//		this.empName = empName;
//		this.empAddress = empAddress;
//		this.empMobNo = empMobNo;
//		this.empYOE = empYOE;
//		this.id = id;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpAddress() {
//		return empAddress;
//	}
//
//	public void setEmpAddress(String empAddress) {
//		this.empAddress = empAddress;
//	}
//
//	public long getEmpMobNo() {
//		return empMobNo;
//	}
//
//	public void setEmpMobNo(long empMobNo) {
//		this.empMobNo = empMobNo;
//	}
//
//	public double getEmpYOE() {
//		return empYOE;
//	}
//
//	public void setEmpYOE(double empYOE) {
//		this.empYOE = empYOE;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empName=" + empName + ", empAddress=" + empAddress + ", empMobNo=" + empMobNo + ", empYOE="
//				+ empYOE + ", id=" + id + ", department=" + department + "]";
//	}

}
