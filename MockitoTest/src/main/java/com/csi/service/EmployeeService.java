package com.csi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeedaoImpl;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeedaoImpl employeedaoImpl;
	
	public List<Employee> getdata(){
		return employeedaoImpl.getAlldata();
	}
	
	/*public void getdatabyid(int empId){
		 employeeRepository.getById(empId);
	}
	*/
	public void saveData(Employee employee){
		employeedaoImpl.saveData(employee);
	}
	
	/*public List<Employee> saveBulkofdata(){
		Employee employee = null;
		employeeRepository.saveAll(employee);
		return null;
	}
	*/
	public void updateData(int empId, Employee employee){
		employeedaoImpl.saveData(employee);
	}
	public void deleteData(int empId){
		employeedaoImpl.deleteData(empId);
	}
}
