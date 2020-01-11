package com.java8.practice.Java8.Practice.test;

@FunctionalInterface
public interface Calculation {

	Long add(Long a, Long b);

	default Long subtraction(Long a, Long b) {
		return a-b;
	}

	default Long multiply(Long a, Long b) {
		return a*b;
	}

	default Long divide(Long a, Long b) {
		return a/b;
	}

	static Long modulo(Long a, Long b) {
		return a % b;
	}
}
