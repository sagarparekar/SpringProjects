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
import com.csi.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	
	@GetMapping("/employee")
	public List<Employee> getdata(){
		return employeeServiceImpl.getData();
	}
	
	@GetMapping("/employee/{empId}")
	public List<Employee> getdatabyid(@PathVariable int empId){
		return employeeServiceImpl.getdatabyId(empId);
	}
	
	@PostMapping("/employee")
	public String savedata(@RequestBody Employee employee){
		employeeServiceImpl.saveData(employee);
		return "data saved";
	}
	
	@PostMapping("/allemployee")
	public String savebulkofdata(@RequestBody List<Employee> employees){
		employeeServiceImpl.saveBulkofData(employees);
		return "bulk of data saved";
	}
	
	@PutMapping("/employee/{empId}")
	public String updatedata(@PathVariable int empId, @RequestBody Employee employee){
		employeeServiceImpl.updateData(empId, employee);
		return "updated";
	}
	
	@DeleteMapping("/employee/{empId}")
	public String deletedata(@PathVariable int empId){
		employeeServiceImpl.deleteData(empId);
		return "Data deleted by id";
	}
	
	@DeleteMapping("/employees")
	public String deleteAllData(){
		employeeServiceImpl.deleteAllData();
		return "deleted all data";
	}
	
	
	

}
