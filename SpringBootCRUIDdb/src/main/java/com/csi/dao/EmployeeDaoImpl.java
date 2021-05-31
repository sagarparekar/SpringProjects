package com.csi.dao;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;

@Component
public class EmployeeDaoImpl {

	@Autowired
	EmployeeRepo employeeRepo;

	public List<Employee> getAlldata() {
		return (List<Employee>) employeeRepo.findAll();
	}

	
	public void saveData(Employee employee) {
		
		employeeRepo.save(employee);

	}

	public void updateData(Employee employee) {

		employeeRepo.save(employee);
		
	}

	public void deleteData(int empId) {
		employeeRepo.deleteById(empId);
	}

	
}
