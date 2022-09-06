package com.mmit.day5;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class practingDatetime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime now = LocalTime.now();
		LocalDate cust_date = LocalDate.of(2022, 10, 19);
		LocalDate parseDate = LocalDate.parse("2022-11-13");
		LocalDate yesterday = date.minusDays(1);
		LocalDate tmw = date.plusDays(1);
		int currentYear = date.getYear();
		Month getMonth = date.getMonth();
		int getMonthValue = date.getMonthValue();
		LocalDateTime startDateofweek = date.atStartOfDay();
		LocalDateTime at_Time = date.atTime(5,4);
		DayOfWeek dayOfweek = date.getDayOfWeek();
		int dayOfyear = date.getDayOfYear();
		int dayOfmonth = date.getDayOfMonth();
		boolean leapYear = date.isLeapYear();
		boolean isEqualDate = date.equals(cust_date);
		
		System.out.println("Date: " + date);
		System.out.println("custom date: " + cust_date);
		System.out.println("parse date: " + parseDate);
		System.out.println("Yesterday: " + yesterday);
		System.out.println("Tomorrow: " + tmw);
		System.out.println("Current year: " + currentYear);
		System.out.println("get month: " + getMonth);
		System.out.println("get value of month: " + getMonthValue);
		System.out.println("day of week" + startDateofweek);
		System.out.println("start date of week: " + startDateofweek);
		System.out.println("At time: " + at_Time);
		System.out.println("Day of week: " + dayOfweek);
		System.out.println("Day of Year: " + dayOfyear);
		System.out.println("Day of month: " + dayOfmonth);
		System.out.println("Is it Leap Year: " + leapYear);
		System.out.println("Is it equal " + date + " and " + cust_date +"? " + isEqualDate);
		
		
		//time
		LocalTime custTime = LocalTime.of(11,06);
		LocalTime parseTime = LocalTime.parse("09:09");
		int previousHour = now.minusHours(1).getHour();
		int previousMinutes = now.minusMinutes(19).getMinute();
		
		
		System.out.println("Time for now: " + now);
		System.out.println("Custom time: " + custTime);
		System.out.println("Parse Time: " + parseTime);
		System.out.println("Previous one hour: " + previousHour);
		System.out.println("Previous minutes: " + previousMinutes);
		
		//current local date time
		LocalDateTime ldt = LocalDateTime.now();
		int currentYear1 = LocalDateTime.now().getYear();
		int currentyear2 = LocalDateTime.now().getDayOfYear();	
		int getHour = now.getHour();
		LocalDateTime datetime = LocalDateTime.of(2015,  Month.OCTOBER, 20, 04, 30);
		
		System.out.println("Local date time: " + ldt);
		System.out.println("Current Year: " + currentYear1);
		System.out.println("Current Year2: " + currentyear2);
		System.out.println("Get hour: " + getHour);
		System.out.println("datetime: " + datetime);
		
		
		
	}

}
