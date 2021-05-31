package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;

	public List<Employee> getAllData() {
		return employeeDaoImpl.getAllData();
	}

	public void saveData(Employee employee) {
		employeeDaoImpl.saveData(employee);
	}

	public void updateData(Employee employee) {

		employeeDaoImpl.updateData(employee);
	}

	public void deleteData(int empId) {
		employeeDaoImpl.deleteData(empId);
	}

}
