package com.mmit.day5;

import java.time.LocalTime;

public class LocalTime_Testing {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Current time is: " + now);// 02:52:54.810131
		
		LocalTime time2 = LocalTime.of(2, 16);
		System.out.println("Current time is: " + time2);//02:16
		
		LocalTime time3 = LocalTime.parse("02:45:15");
		System.out.println("Time check with parse is: " + time3);//it shows the string between double code.
		
		System.out.println("Previous hour: " + now.minusHours(1));//it shows previous one hour.
		
		System.out.println("Current Hour: " + now.getHour());//current time
		
		System.out.println("Current minute: " + now.getMinute() + " mins.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
