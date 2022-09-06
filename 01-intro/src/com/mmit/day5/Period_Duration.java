package com.mmit.day5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Period_Duration {

	public static void main(String[] args) {
		LocalDate start_date = LocalDate.of(2019,  9, 25);
		LocalDate end_date = LocalDate.of(2021, 10, 31);
		
		int months = Period.between(start_date, end_date).getMonths();
		int years = Period.between(start_date, end_date).getYears();
		int days = Period.between(start_date, end_date).getDays();
		
		
		
		
		System.out.println("Different month(s): " + months);
		System.out.println("Different year(s): " + years);
		System.out.println("Different year(s): " + days);
		
		
		
		
		
//		LocalDate start_date = LocalDate.of(2019, 9, 25);
//		LocalDate end_date = LocalDate.of(2021, 10, 31);
//		
//		int months = Period.between(start_date, end_date).getMonths();
//		int years = Period.between(start_date, end_date).getYears();
//		int days = Period.between(start_date, end_date).getDays();
//		
//		System.out.println("Months: " + months);//1
//		System.out.println("Years: " + years);//2
//		System.out.println("Days: " + days);//6
//		
//		LocalTime time1 = LocalTime.of(11,  30);
//		LocalTime time2 = LocalTime.of(12,  0);
//		
//		long seconds = Duration.between(time1, time2).getSeconds();
//		System.out.println("Total seconds: " + seconds);

	}

}
