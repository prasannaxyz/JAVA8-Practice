package com.java8.practice.Java8_Practice.test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.java8.practice.Java8_Practice.vo.Employee;

public class VerifyComparator {
	
	public static void main(String[] args) {
		Comparator<Employee> compareByAge = (Employee o1, Employee o2) -> o1.getAge().compareTo(o2.getAge());
		Comparator<Employee> compareByFirstName = (Employee o1, Employee o2) -> o1.getFirstName().compareTo(o2.getFirstName());
		Comparator<Employee> compareByLastName = (Employee o1, Employee o2) -> o1.getLastName().compareTo(o2.getLastName());
		Comparator<Employee> compareCompositeFields=compareByAge.thenComparing(compareByFirstName).thenComparing(compareByLastName);
		List<Employee> employees = getEmployees().stream().sorted(compareCompositeFields).collect(Collectors.toList());
		System.out.println(employees);
	}

	private static List<Employee> getEmployees() {
		List<Employee> employees = Lists.newArrayList();
		employees.add(new Employee(6, "Yash", "Chopra", 60));
		employees.add(new Employee(2, "Aman", "Sharma", 28));
		employees.add(new Employee(3, "Aakash", "Yaadav", 52));
		employees.add(new Employee(5, "David", "Kameron", 19));
		employees.add(new Employee(4, "James", "Hedge", 72));
		employees.add(new Employee(8, "Balaji", "Subbu", 88));
		employees.add(new Employee(11, "Balaji", "Dev", 88));
		employees.add(new Employee(7, "Karan", "Johar", 59));
		employees.add(new Employee(1, "Lokesh", "Gupta", 32));
		employees.add(new Employee(9, "Vishu", "Bissi", 33));
		employees.add(new Employee(10, "Lokesh", "Ramachandran", 60));
		return employees;
	}
}
