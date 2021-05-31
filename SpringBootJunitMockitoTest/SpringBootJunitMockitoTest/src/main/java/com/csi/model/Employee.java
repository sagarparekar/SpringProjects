package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data // we need not to create getter setter 
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
