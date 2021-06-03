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

import com.csi.exception.RecordNotFound;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeServiceImpl;

	@Autowired
	EmployeeRepo employeeRepoImpl;

	@GetMapping("/employees")
	List<Employee> getAlldata() {
		return employeeServiceImpl.getAlldata();
	}

	@GetMapping("/employees/{empId}")
	public String getDataById(@PathVariable int empId) {
		employeeServiceImpl.getdataById(empId);
		return "getdatabyid";
	}

	@PostMapping("/employees")
	public String savaData(@RequestBody Employee employee) {
		employeeServiceImpl.saveDataById(employee);
		return "saved";
	}

	@PutMapping("/employees/{empId}")
	public String updateData(@PathVariable int empId, Employee employee) throws RecordNotFound {
		Employee emp = employeeRepoImpl.findById(empId)
				.orElseThrow(() -> new RecordNotFound("Record Not Found with Id:" + empId));
		employeeServiceImpl.updateData(employee);
		return "updated";
	}

	@DeleteMapping("/employees/{empId}")
	public String deleteData(@PathVariable int empId) throws RecordNotFound {

		Employee employee = employeeRepoImpl.findById(empId)
				.orElseThrow(() -> new RecordNotFound("Record Not Found with Id:" + empId));
		employeeServiceImpl.deleteDataById(empId);
		return "deleted";
	}
}
