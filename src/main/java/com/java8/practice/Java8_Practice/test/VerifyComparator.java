package com.java8.practice.Java8_Practice.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.java8.practice.Java8_Practice.vo.Employee;

public class VerifyComparator {
	
	public static void main(String[] args) {
		Comparator<Employee> compareById = (Employee o1, Employee o2) -> o1.getId().compareTo(o2.getId());
		List<Employee> employees = getEmployees().stream().sorted(compareById).collect(Collectors.toList());
		System.out.println(employees);
	}

	private static List<Employee> getEmployees() {
		List<Employee> employees = Lists.newArrayList();
		employees.add(new Employee(6, "Yash", "Chopra", 25));
		employees.add(new Employee(2, "Aman", "Sharma", 28));
		employees.add(new Employee(3, "Aakash", "Yaadav", 52));
		employees.add(new Employee(5, "David", "Kameron", 19));
		employees.add(new Employee(4, "James", "Hedge", 72));
		employees.add(new Employee(8, "Balaji", "Subbu", 88));
		employees.add(new Employee(7, "Karan", "Johar", 59));
		employees.add(new Employee(1, "Lokesh", "Gupta", 32));
		employees.add(new Employee(9, "Vishu", "Bissi", 33));
		employees.add(new Employee(10, "Lokesh", "Ramachandran", 60));
		return employees;
	}
}
