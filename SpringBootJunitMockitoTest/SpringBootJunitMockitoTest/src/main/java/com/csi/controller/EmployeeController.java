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
	EmployeeService employeeserviceImpl;
	
	@GetMapping("/employees")
	public List<Employee> getAllData(){
		return employeeserviceImpl.getAllData();
	}
	
	@PostMapping("/employees")
	public String saveData(@RequestBody Employee employee){
		employeeserviceImpl.saveData(employee);
		return "Data saved successfully";
	}
	
	@PutMapping("/employees/{empId}")
	public String updateData(@RequestBody Employee employee)
	{
		employeeserviceImpl.updateData(employee);
		return "Data Updated successfully";
	}
	
	@DeleteMapping("/employees/{empId}")
	public String deleteData(@PathVariable("empId") int empId)
	{
		employeeserviceImpl.deleteData(empId);
		return "Data deleted by id successfully";
		
	}
	
	
	
}
