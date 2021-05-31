package com.csi.daoimpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTest {
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	@MockBean
	EmployeeRepo employeeRepo;
	
	@Test
	public void getAlluserTest(){
		when(employeeRepo.findAll()).thenReturn(Stream.of(new Employee(111, "SWARA", 88888.77),new Employee(112, "BINU", 99999.88)).collect(Collectors.toList()));
		assertEquals(2, employeeDaoImpl.getAlldata().size());
	}
	
	@Test
	public void saveDataTest(){
		Employee emp=new Employee(333, "Varsha", 87888.99);
		employeeDaoImpl.saveData(emp);
		verify(employeeRepo, times(1)).save(emp);
	}
	@Test
	public void deleteUserTest(){
		Employee emp=new Employee(333, "Varsha", 87888.99);
		employeeDaoImpl.deleteData(emp.getEmpId());
		verify(employeeRepo, times(1)).deleteById(emp.getEmpId());
	}
	
}

