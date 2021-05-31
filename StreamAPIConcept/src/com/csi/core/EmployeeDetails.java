package com.csi.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeDetails {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "siva", 101, "active", 2000));
		empList.add(new Employee(102, "reddy", 101, "active", 5000));
		empList.add(new Employee(103, "raju", 102, "inactive", 6000));
		empList.add(new Employee(104, "shivam", 102, "inactive", 4000));
		empList.add(new Employee(105, "bob", 103, "active", 3500));
		empList.add(new Employee(106, "alice", 103, "inactive", 3500));
		empList.add(new Employee(107, "srinu", 104, "active", 3500));

		// To Print employee details based on dept

		Map<Integer, List<Employee>> emplistBasedOnDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
		emplistBasedOnDept.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "------------" + entry.getValue());
		});

		// To count respective department salary
		Map<Integer, Integer> totalsalaryByDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.summingInt(Employee::getSalary)));
			totalsalaryByDept.entrySet().forEach(entry -> {
				System.out.println("\n To count respective department salary : "+entry.getKey()+"--------"+entry.getValue());
			});
		// To Print employees count working in each department

		Map<Integer, Long> empContDept = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
		empContDept.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "-------" + entry.getValue());
		});

		// To print active and inactive elements in collections

		long activeEmpCount = empList.stream().filter(e -> "active".equals(e.getStatus())).count();
		long inactiveEmpCount = empList.stream().filter(e -> "inactive".equals(e.getStatus())).count();

		System.out.println("Acive Employee Count:" + activeEmpCount);
		System.out.println("Inactive Employee Count:" + inactiveEmpCount);

		// To print Min/Max Employee Salary from the given collections

		Optional<Employee> emp1 = empList.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> emp2 = empList.stream().min(Comparator.comparing(Employee::getSalary));

		System.out.println(emp1);
		System.out.println(emp2);

		// To print Max salary of an Employee from each Department

		Map<Integer, Optional<Employee>> topSalaryEmpDeptWise = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		topSalaryEmpDeptWise.entrySet().forEach(entry -> {
			System.out.println("Dept:" + entry.getKey() + " Top Emp  " + entry.getValue());
		});

		// To print Min salary of an Employee from each Department

		Map<Integer, Optional<Employee>> minSalaryEmpDeptWise = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId,
						Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));
		minSalaryEmpDeptWise.entrySet().forEach(entry -> {
			System.out.println("Department:" + entry.getKey() + " Min Emp  " + entry.getValue());
		});

	}
}
