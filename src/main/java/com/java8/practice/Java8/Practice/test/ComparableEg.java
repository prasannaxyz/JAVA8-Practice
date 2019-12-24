package com.java8.practice.Java8.Practice.test;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;
import com.java8.practice.Java8.Practice.vo.Vendor;

public class ComparableEg {

	public static void main(String[] args) {
		List<Vendor> vendors = getVendors();
		Collections.sort(vendors);
		System.out.println(vendors);
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
