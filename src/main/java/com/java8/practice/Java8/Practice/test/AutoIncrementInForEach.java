package com.java8.practice.Java8.Practice.test;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.collections.CollectionUtils;

import com.google.common.collect.Lists;
import com.java8.practice.Java8.Practice.vo.Vendor;

public class AutoIncrementInForEach {

	public static void main(String[] args) {
		List<Vendor> vendors = Lists.newArrayList();
		AtomicInteger counter = new AtomicInteger(1);
		if (CollectionUtils.isNotEmpty(vendors)) {
			vendors.forEach(vendor -> vendor.setId((Integer.valueOf(counter.getAndIncrement()))));
		}

	}
}
