package com.csi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csi.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
