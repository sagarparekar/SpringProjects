package com.csi.daoImpltest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;



import com.csi.dao.EmployeedaoImpl;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaotest {

	@Autowired
	EmployeedaoImpl employeedaoImpl;
	
	@MockBean
	EmployeeRepository employeeRepositoryImpl;
	
	@Test
	public void getusertest(){
		when(employeeRepositoryImpl.findAll()).thenReturn(Stream.of(new Employee(111, "sagar", "indp", 122233.99),new Employee(133, "ravi", "solapur", 4444.88)).collect(Collectors.toList()));
		assertEquals(2, employeedaoImpl.getAlldata().size());
	}
	
	@Test
	public void saveUsertest(){
		Employee emp=new Employee(111, "mahesh", "indpur", 554477.99);
		//Employee employee = null;
		employeedaoImpl.saveData(emp);
		verify(employeeRepositoryImpl, times(1)).save(emp);
	}
	@Test
	public void deleteUser(){
		Employee emp=new Employee(111, "varsha", "solapur", 4444.88);
		employeedaoImpl.deleteData(emp.getEmpId());
		verify(employeeRepositoryImpl, times(1)).deleteById(emp.getEmpId());
	}
	/*@Test
	public void updateUser(){
		Employee employee=employeeRepositoryImpl.findAllById(Integer,1);
		employee.setEmpSalary(1222.88);
		Employee updatedEmployee=employeeRepositoryImpl.findAllById(1);
		assertThat(updatedEmployee.getEmpSalary()==(1222.77);
	}*/
}
