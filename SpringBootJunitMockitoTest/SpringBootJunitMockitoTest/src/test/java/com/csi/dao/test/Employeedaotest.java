package com.csi.dao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.verification.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repository.EmpoyeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Employeedaotest {

	@Autowired
	EmployeeDaoImpl employeedaoimpl;

	@MockBean
	EmpoyeeRepository employeeRepositoryimpl;

	@Test
	public void getuserstest() {
		when(employeeRepositoryimpl.findAll()).thenReturn(Stream.of(new Employee(122, "SWARA", 2400.99),
				new Employee(123, "BUNI", 1100.00), new Employee(124, "ROHIT", 1400.55)).collect(Collectors.toList()));
		assertEquals(3, employeedaoimpl.getAllData().size());
	}

	@Test
	public void saveUserTest() {
		Employee employee = new Employee(121, "swara", 4455588.99);
		employeedaoimpl.saveData(employee);
		verify(employeeRepositoryimpl, times(1)).save(employee);
	}

	@Test
	public void deleteUserTest() {
		Employee employee = new Employee(121, "swara", 4455588.99);
		employeedaoimpl.deleteData(employee.getEmpId());
		verify(employeeRepositoryimpl, times(1)).deleteById(employee.getEmpId());
	}
	
}
