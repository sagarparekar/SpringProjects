package com.csi.core2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private int empId;
	private String empName;
	private Address address;

	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
}

class Address  {

	String city;
	String location;

	public Address(String city, String location) {
		super();
		this.city = city;
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", location=" + location + "]";
	}
}

public class SortingCode {
	public static void main(String[] args) {

	
		
		List<Address> addList=new ArrayList<>();
		addList.add(new Address("Indapur", "Vangali"));
		addList.add(new Address("Ahamdabad", "otti"));
	
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(111, "sagar", employeeListbycity));
		list.add(new Employee(102, "Parekar", employeeListbycity));

		Map<Address, List<Employee>> employeeListbycity = list.stream()
				.collect(Collectors.groupingBy(Employee::getAddress, Collectors.toList()));
		employeeListbycity.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		});

	}
}
