package com.csi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	

}
