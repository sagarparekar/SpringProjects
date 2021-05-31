package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.model.Employee;


public interface EmployeeService {

	public List<Employee> getData();
	
	public List<Employee> getdatabyId(int empId);
	
	public void saveData(Employee employee);
	
	public void saveBulkofData(List<Employee> employees);
	
	public void updateData(int empId, Employee employee);
	
	public void deleteData(int empId);
	
	public void deleteAllData();
}
