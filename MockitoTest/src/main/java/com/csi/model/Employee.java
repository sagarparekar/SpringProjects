package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue
	
	private int empId;
	private String empName;
	private String empAdd;
	private double empSalary;
	public Employee(int empId, String empName, String empAdd, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
	}
	
	
}
