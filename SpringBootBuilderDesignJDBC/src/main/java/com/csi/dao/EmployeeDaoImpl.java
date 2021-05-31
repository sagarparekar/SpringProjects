package com.csi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate JdbcTemplate;

	public static final String selectAllsql = "select * from employee";
	public static final String selectSQL = "select * from employee where empId=?";
	public static final String insertSql = "insert into employee(empid,empname,empsalary,empdob)values(?,?,?,?)";
	public static final String insertAllSql = "insert into employee(empid,empname,empsalary,empdob)values(?,?,?,?)";
	public static final String updateSQL = "update employee set empname=?,empsalary=?,empdob=? where empid=?";
	public static final String deleteSQLbyId = "delete from employee where empid=?";
	public static final String deleteAllSQL = "delete from employee";

	private Employee Employee(ResultSet resultSet, int numRow) throws SQLException {
		return Employee.builder().empId(resultSet.getInt(1)).empName(resultSet.getString(2))
				.empSalary(resultSet.getDouble(3)).empDOB(resultSet.getDate(4)).build();
	}

	@Override
	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return JdbcTemplate.query(selectAllsql, this::Employee);
	}

	@Override
	public List<Employee> getdatabyId(int empId) {
		// TODO Auto-generated method stub
		return (List<Employee>) JdbcTemplate.query(selectSQL, this::Employee, empId);
	}

	@Override
	public void saveData(Employee employee) {
		// TODO Auto-generated method stub
		JdbcTemplate.update(insertSql, employee.getEmpId(), employee.getEmpName(), employee.getEmpSalary(),
				employee.getEmpDOB());
	}

	@Override
	public void saveBulkofData(List<Employee> employees) {
		// TODO Auto-generated method stub

		for (Employee empList : employees) {
			JdbcTemplate.update(insertAllSql, empList.getEmpId(), empList.getEmpName(), empList.getEmpSalary(),
					empList.getEmpDOB());
		}
	}

	@Override
	public void updateData(int empId, Employee employee) {
		// TODO Auto-generated method stub
		JdbcTemplate.update(updateSQL, employee.getEmpName(), employee.getEmpSalary(), employee.getEmpDOB(), empId);
	}

	@Override
	public void deleteData(int empId) {
		// TODO Auto-generated method stub
		JdbcTemplate.update(deleteSQLbyId, empId);

	}

	@Override
	public void deleteAllData() {
		// TODO Auto-generated method stub
		JdbcTemplate.update(deleteAllSQL);
	}

}
