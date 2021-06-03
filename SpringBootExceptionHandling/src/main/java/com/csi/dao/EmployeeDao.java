package com.csi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;

@Component
public class EmployeeDao {

	@Autowired
	EmployeeRepo employeeRepoImpl;
	
	public List<Employee> getAlldata(){
		return employeeRepoImpl.findAll();
	}
	
	public Optional<Employee> getdataById(int empId){
		return employeeRepoImpl.findById(empId);
	}
	
	public void saveDataById(Employee employee){
		 employeeRepoImpl.save(employee);
	}
	public void updateData(Employee employee){
		employeeRepoImpl.save(employee);
	}
	public void deleteDataById(int empId){
		 employeeRepoImpl.deleteById(empId);
	}
}
