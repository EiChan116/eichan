package com.mmit.day5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class practingDatetime {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate date1 = LocalDate.of(2022, 10, 10);
		LocalDate date2 = LocalDate.parse("2021-02-11");
		 
		LocalDate yesterday = now.minusDays(1);
		
		System.out.println(now);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println("Yesterday: " + yesterday);
		System.out.println("Tomorrow " + now.plusDays(1));
		System.out.println("Current year: " + now.getYear());
		System.out.println("Get month: " + now.getMonthValue());
		System.out.println("Get month name: " + now.getMonth());
		System.out.println("Get Today name: " + now.getDayOfWeek());
		System.out.println("Get today date name: " + now.getDayOfMonth());
		System.out.println("Get days of a year until today " + now.getDayOfYear());
		
		System.out.println("Date1 is leap year? " + date1.isLeapYear());
		System.out.println("Date1 == Date2? " + date1.equals(date2));
		System.out.println();
		//local time
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(11, 30);
		System.out.println(time1);
		System.out.println(time2);
		System.out.println("Previous hour: " + time1.plusHours(2).getHour());
		System.out.println("add mins: " + time1.plusMinutes(3).getMinute());
		
		//datetime
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDate start_date = LocalDate.parse("2010-11-02");
		LocalDate end_date = LocalDate.parse("2021-01-19");

		int months = Period.between(start_date, end_date).getMonths();
		int days = Period.between(start_date, end_date).getDays();
		int years = Period.between(start_date, end_date).getYears();
		
		System.out.println("---------------------------------------------------");
		
		System.out.println(months + " months.");
		System.out.println(days + " days.");
		System.out.println(years + " year(s).");
		
		LocalTime lt1 = LocalTime.of(11, 30);
		LocalTime lt2 = LocalTime.of(12, 0);
		
		long seconds = Duration.between(lt1, lt2).getSeconds();
		System.out.println("Tot sec is: " + seconds);

	}

}
