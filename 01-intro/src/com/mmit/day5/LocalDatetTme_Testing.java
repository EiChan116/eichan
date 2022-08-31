package com.mmit.day5;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDatetTme_Testing {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current date/time: " + now);//2022-09-01T03:47:05.745734
		
		LocalDateTime datetime = LocalDateTime.of(2022, Month.OCTOBER, 20, 04, 30);
		System.out.println("datetime: " + datetime);//2022-10-20T04:30
		
		System.out.println("Current year: " + now.getYear());//2022
		
		System.out.println("Current month: " + now.getMonth());//SEPTEMBER
		
		System.out.println("Current day of month: " + now.getDayOfMonth());//1
		
		System.out.println("Current day of year: " + now.getDayOfYear());//244
		
		System.out.println("Current day of week: " + now.getDayOfWeek());
		
		System.out.println("Current hour: " + now.getHour());
		
		System.out.println("Current mins: " + now.getMinute());
		
		System.out.println("Current secs: " + now.getSecond());

	}

}
