package com.csi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDaoImpl;

	public List<Employee> getAlldata() {
		return employeeDaoImpl.getAlldata();
	}

	public Optional<Employee> getdataById(int empId) {
		return employeeDaoImpl.getdataById(empId);
	}

	public void saveDataById(Employee employee) {
		employeeDaoImpl.saveDataById(employee);
	}

	public void updateData(Employee employee) {
		employeeDaoImpl.updateData(employee);
	}

	public void deleteDataById(int empId) {
		employeeDaoImpl.deleteDataById(empId);
	}
}
