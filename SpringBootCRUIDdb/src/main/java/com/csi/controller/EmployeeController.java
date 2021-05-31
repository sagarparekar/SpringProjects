package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.services.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/employee")
	public List<Employee> getdata() {
		return employeeServiceImpl.getAlldata();

	}

	@PostMapping("/employee")
	public String saveData(@RequestBody Employee employee) {
		employeeServiceImpl.saveData(employee);
		return "Data saved";
	}

	@PutMapping("/employee/{empId}")
	public String updateData(@PathVariable int empId,@RequestBody Employee employee) {
		employeeServiceImpl.updateData(employee);
		return "updated";
	}

	@DeleteMapping("/employee/{empId}")
	public String deleteData(@PathVariable int empId) {
		employeeServiceImpl.deleteData(empId);
		return "deleted";
	}
}
