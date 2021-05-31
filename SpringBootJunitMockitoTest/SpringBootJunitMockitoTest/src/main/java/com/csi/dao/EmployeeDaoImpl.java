package com.csi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repository.EmpoyeeRepository;

@Component
public class EmployeeDaoImpl {

	@Autowired
	EmpoyeeRepository employeeRepositoryImpl;

	public List<Employee> getAllData() {
		return employeeRepositoryImpl.findAll();
	}

	public void saveData(Employee employee) {
		employeeRepositoryImpl.save(employee);
	}

	public void updateData(int empId, Employee employee) {

		employeeRepositoryImpl.save(employee);
	}

	public void deleteData(int empId) {
		employeeRepositoryImpl.deleteById(empId);
	}

	

	
}
