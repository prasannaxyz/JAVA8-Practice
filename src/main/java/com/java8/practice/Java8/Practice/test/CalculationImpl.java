package com.java8.practice.Java8.Practice.test;

public class CalculationImpl {

	public static void main(String[] args) {

		Calculation cal = (a, b) -> a + b;
		System.out.println(cal.add(5l, 6l));
		System.out.println(cal.multiply(5l, 6l));
		System.out.println(Calculation.modulo(10l, 4l));
	}

}
