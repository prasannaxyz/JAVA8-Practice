package com.java8.practice.Java8.Practice.vo;

import java.util.List;

public class Vendor implements Comparable<Vendor> {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private List<Customer> customers;

	public Vendor(Integer id, String firstName, String lastName, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "\n[" + this.id + "," + this.firstName + "," + this.lastName + "," + this.age + "]";
	}

	@Override
	public int compareTo(Vendor v) {
		if (this.id.compareTo(v.getId()) > 0)
			return 1;
		if (this.id.compareTo(v.getId()) < 0)
			return -1;
		else
			return 0;
	}
}