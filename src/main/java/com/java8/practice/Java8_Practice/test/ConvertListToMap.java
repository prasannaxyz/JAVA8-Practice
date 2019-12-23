package com.java8.practice.Java8_Practice.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.java8.practice.Java8_Practice.vo.Vendor;

public class ConvertListToMap {
	public static void main(String[] args) {
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
