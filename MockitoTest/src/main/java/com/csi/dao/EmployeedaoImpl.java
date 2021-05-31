package com.csi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Component
public class EmployeedaoImpl {

	@Autowired
	EmployeeRepository employeerepositoryImpl;
	
	public List<Employee> getAlldata(){
		return employeerepositoryImpl.findAll();
	}
	
	/*public Employee getemployeeDatabyId(int empId){
		return employeerepositoryImpl.getById(empId);
	}*/
	
	public Employee saveData(Employee employee){
		return employeerepositoryImpl.save(employee);
		
	}
	/*public  Employee saveBulkOfData(Employee employee){
		return (Employee) employeerepositoryImpl.saveAll(employee);
	}*/
	
	public void updateData(int empId, Employee employee){
		Employee emp=employeerepositoryImpl.getOne(empId);
		emp.setEmpName(employee.getEmpName());
		emp.setEmpAdd(employee.getEmpAdd());
		emp.setEmpSalary(employee.getEmpSalary());
		employeerepositoryImpl.save(emp);
	}
	
	public void deleteData(int empId){
		employeerepositoryImpl.deleteById(empId);
	}
}
