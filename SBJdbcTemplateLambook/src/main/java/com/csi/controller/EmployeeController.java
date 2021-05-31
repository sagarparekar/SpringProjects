package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeServiceImpl;
	
	@GetMapping("/employees")
	public List<Employee> getData(){
		return employeeServiceImpl.getAlldata();
	}
	
	@PostMapping("/employees")
	public String saveData(@RequestBody Employee employee){
		employeeServiceImpl.saveData(employee);
		return "Data Saved Successfully";
	}
	
	@PutMapping("/employees/{empId}")
	public String updateData(@PathVariable int empId, @RequestBody Employee employee){
		employeeServiceImpl.updateData(empId, employee);
		return "Data Updated successfully";
	}
	
	@DeleteMapping("/employees/{empId}")
	public String deleteData(@PathVariable int empId){
		employeeServiceImpl.deleteData(empId);
		return "Delete Data Successfully";
		
	}

}
