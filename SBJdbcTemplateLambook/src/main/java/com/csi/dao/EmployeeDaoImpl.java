package com.csi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.Builder;
import com.csi.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	public static final String selectAllSQL="select * from employee";
	public static final String insertSQL="insert into employee(empid,empname,empsalary)values(?,?,?)";
	public static final String updateSQL="update employee set empname=?, empsalary=? where empid=?";
	public static final String deleteSQL="delete from employee where empid=?";
	
//	private Employee employee(ResultSet resultSet, int numRow){
//		 ;
//		return Employee.bu;
//		
//	}
	private Employee employee(ResultSet resultSet, int row) throws SQLException {
		return Employee.builder().empId(resultSet.getInt(1)).empName(resultSet.getString(2)).empSalary(resultSet.getDouble(3)).build();
	}
	
	@Override
	public List<Employee> getAlldata() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(selectAllSQL, this::employee);
	}

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(insertSQL, employee.getEmpId(),employee.getEmpName(),employee.getEmpSalary());
		
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(updateSQL,employee.getEmpName(),employee.getEmpSalary(),empId);
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(deleteSQL,empId);
	}

}
