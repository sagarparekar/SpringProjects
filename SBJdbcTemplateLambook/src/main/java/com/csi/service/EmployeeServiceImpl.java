package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao EmployeeDaoImpl;
	
	@Override
	public List<Employee> getAlldata() {
		// TODO Auto-generated method stub
		return EmployeeDaoImpl.getAlldata();
	}

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeDaoImpl.saveData(employee);
		
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub
		EmployeeDaoImpl.updateData(empId, employee);
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub
		EmployeeDaoImpl.deleteData(empId);
		
	}

	
}
