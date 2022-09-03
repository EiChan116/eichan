package com.mmit.day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class customDateime {

	public static void main(String[] args) {
		DateTimeFormatter f1 = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate today = LocalDate.now();
		LocalTime rightNow = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Default style of today: " + today);
		
		String now = f1.format(today);
		System.out.println("ISO format " + now);
		System.out.println("ISO format: " + today.format(f1));
		
		//custom format
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		DateTimeFormatter f5 = DateTimeFormatter.ofPattern("hh:mm:ss a");
		DateTimeFormatter f6 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' hh:mm:ss a");
		System.out.println("custom format of date: " + today.format(f4));
		System.out.println("custom format of time: " + rightNow.format(f5));
		System.out.println("custome format of date-time: " + dt.format(f6));
		
		//localize
		DateTimeFormatter f7 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter f8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter f9 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println("default style: " + today);
		System.out.println("localized full style: " + today.format(f7));
		System.out.println("localized medium style: " + today.format(f8));
		System.out.println("localized long style: " + today.format(f9));
		System.out.println("localized short style: " + today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

	}

}
