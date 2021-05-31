package com.csi.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.csi.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

	void save(Optional<Employee> employee);

}
