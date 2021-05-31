package com.csi.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	

}
