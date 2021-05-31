package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDaoImpl employeedaoImpl;
	
	@Override
	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return employeedaoImpl.getData();
	}

	@Override
	public List<Employee> getdatabyId(int empId) {
		// TODO Auto-generated method stub
		return employeedaoImpl.getdatabyId(empId);
	}

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		employeedaoImpl.saveData(employee);
	}

	@Override
	public void saveBulkofData(List<Employee> employees) {
		// TODO Auto-generated method stub
		employeedaoImpl.saveBulkofData(employees);
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub
		employeedaoImpl.updateData(empId, employee);
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub
		employeedaoImpl.deleteData(empId);
	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		employeedaoImpl.deleteAllData();
	}

}
