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
	EmployeeService employeeService;

	@PostMapping("/saveData")
	public String saveData(@RequestBody Employee employee) {
		employeeService.saveData(employee);
		return "Data saved successfully";
	}

	@GetMapping("/getData")
	public List<Employee> getAlldata() {
		return employeeService.getdata();

	}
	/*@GetMapping("/getbulkofdata")
	public List<Employee> getbulkofdata(){
		return employeeService.saveBulkofdata();
	}*/

	@PutMapping("/updateData/{empId}")
	public String updatedata(@PathVariable ("empId")int empId, @RequestBody Employee employee) {
		employeeService.updateData(empId, employee);
		return "data updated successfully";
	}

	@DeleteMapping("/deleteData/{empId}")
	public String deleteData(@PathVariable int empId){
		employeeService.deleteData(empId);
		return "data updated successfully";
	}
	
}
