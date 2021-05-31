package com.csi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue

	private int custId;

	private String custName;

	private double custSalary;
	@JsonFormat(pattern = "dd-MM-yy")
	private Date customerLaunchDate;

	public Customer(int custId, String custName, double custSalary, Date customerLaunchDate) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custSalary = custSalary;
		this.customerLaunchDate = customerLaunchDate;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
}
