package com.java8.practice.Java8.Practice.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Optional;

public class OrElseThrow {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String dateInString = "23-08-2005 10:20:56";
		Date dob = sdf.parse(dateInString);
		eligibleForVote(dob);
	}

	private static void eligibleForVote(Date dob) {
		int age = Optional.ofNullable(dob).map(dateOfBirth -> getYears(dateOfBirth))
				.filter(years -> Objects.nonNull(years) && years > 18)
				.orElseThrow(() -> ageNotSupported("You are not eligible for voting."));
		System.out.println(age);

	}

	private static int getYears(Date dob) {
		Calendar today = new GregorianCalendar();
		today.setTime(new Date());
		Calendar dobCalendar = new GregorianCalendar();
		dobCalendar.setTime(dob);
		return today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);

	}

	public static RuntimeException ageNotSupported(String message) {
		return new RuntimeException(message);
	}
}
