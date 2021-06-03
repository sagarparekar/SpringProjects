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

	private double empSalary;

}
