package com.mmit.day5;

import java.time.LocalDate;
public class LocalDate_Testing {

	public static void main(String[] args) {
		LocalDate year2016 = LocalDate.of(2016, 10, 10);
		
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalDate date2 = LocalDate.of(2022, 10, 16);
		System.out.println("date2: " + date2);
		
		LocalDate date3 = LocalDate.parse("2016-10-16");
		System.out.println("date3: " + date3);
		
		LocalDate yesterday = today.minusDays(1);
		System.out.println("Yesterday: " + yesterday);
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		
		System.out.println("Current year: " + today.getYear());
		
		int cy = today.getYear();
		System.out.println("Current year with cy var: " + cy);
		
		int cm = today.getMonthValue();
		System.out.println("Get month value with cm var: " + cm);
		
		System.out.println("Get current month with enum datatype returned: " + today.getMonth());
		
		System.out.println("Get day of week(current day): " + today.getDayOfWeek());
		
		System.out.println("Get day of month(current day):" + today.getDayOfMonth());
		
		System.out.println("Now is leap year? " + today.isLeapYear());
		
		System.out.println("2016 is leap year? " + year2016.isLeapYear());
		
		System.out.println(today + " is same to " + date2 + " : " + today.equals(date2));
	}

}
