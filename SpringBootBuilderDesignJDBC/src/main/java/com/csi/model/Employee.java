package com.csi.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	@JsonFormat(pattern = "dd-MM-yyyy", timezone = "INDIA")
	private Date empDOB;

	
	public Employee(int empId, String empName, double empSalary, Date empDOB) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDOB = empDOB;
	
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDOB=" + empDOB
				+ "]";
	}

	public Employee() {
		super();
	}

}
