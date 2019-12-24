package com.java8.practice.Java8.Practice.test;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.java8.practice.Java8.Practice.vo.Customer;
import com.java8.practice.Java8.Practice.vo.Vendor;

public class ConvertListToMap {

	public static void main(String[] args) {
		prepareVendorMap();
		prepareIdNameMap();
		prepareGroupByAgeMap();
		prepareSubListByAgeMap();
	}

	private static void prepareSubListByAgeMap() {
		Map<Integer, List<Customer>> customersByVendorAgeMap = Maps.newHashMap();
		List<Vendor> vendorList = getVendors();
		if (CollectionUtils.isNotEmpty(vendorList)) {
			customersByVendorAgeMap = vendorList.stream()
					.filter(vendor -> CollectionUtils.isNotEmpty(vendor.getCustomers())).collect(Collectors
							.toMap(Vendor::getAge, vendor -> vendor.getCustomers(), (customerList1, customerList2) -> {
								customerList1.addAll(customerList2);
								return customerList1;
							}));
		}
		System.out.println(customersByVendorAgeMap);

	}

	private static void prepareGroupByAgeMap() {
		Map<Integer, List<Vendor>> groupByAgeMap = Maps.newHashMap();
		List<Vendor> vendorList = getVendors();
		if (CollectionUtils.isNotEmpty(vendorList)) {
			groupByAgeMap = vendorList.stream().collect(Collectors.groupingBy(Vendor::getAge));
		}
		System.out.println(groupByAgeMap);

	}

	private static void prepareIdNameMap() {
		Map<Integer, String> nameByIdMap = Maps.newHashMap();
		List<Vendor> vendorList = getVendors();
		if (CollectionUtils.isNotEmpty(vendorList)) {
			nameByIdMap = vendorList.stream().collect(Collectors.toMap(Vendor::getId,
					vendor -> String.join("-", vendor.getFirstName(), vendor.getLastName()), (id1, id2) -> id1));
		}
		System.out.println(nameByIdMap);
	}

	private static void prepareVendorMap() {
		Map<Integer, Vendor> vendorMap = Maps.newHashMap();
		List<Vendor> vendorList = getVendors();
		if (CollectionUtils.isNotEmpty(vendorList)) {
			vendorMap = vendorList.stream()
					.collect(Collectors.toMap(Vendor::getId, entry -> entry, (entry1, entry2) -> entry1));
		}
		System.out.println(vendorMap);
	}

	private static List<Vendor> getVendors() {
		List<Vendor> vendors = Lists.newArrayList();
		vendors.add(new Vendor(6, "Yash", "Chopra", 60));
		vendors.add(new Vendor(2, "Aman", "Sharma", 28));
		vendors.add(new Vendor(3, "Aakash", "Yaadav", 52));
		vendors.add(new Vendor(5, "David", "Kameron", 19));
		vendors.add(new Vendor(4, "James", "Hedge", 72));
		vendors.add(new Vendor(8, "Balaji", "Subbu", 88));
		vendors.add(new Vendor(11, "Balaji", "Dev", 88));
		vendors.add(new Vendor(7, "Karan", "Johar", 59));
		vendors.add(new Vendor(1, "Lokesh", "Gupta", 32));
		vendors.add(new Vendor(9, "Vishu", "Bissi", 33));
		vendors.add(new Vendor(10, "Lokesh", "Ramachandran", 60));
		return vendors;
	}
}
