package com.mmit.day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Datetime_Formatting {

	public static void main(String[] args) {
		//predefined constants
		
		DateTimeFormatter f1 = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		LocalDate date = LocalDate.now();
		
		System.out.println("Default date: " + date);
		
		System.out.println("ISO format: " + date.format(f1));
		System.out.println("ISO format: " + f1.format(date));
		
		//custom format FOR date
		DateTimeFormatter f4 = DateTimeFormatter.ofPattern("MMMM dd yyy");
		System.out.println("Format1: " + date.format(f4));
		
		DateTimeFormatter f5 = DateTimeFormatter.ofPattern("MMM dd yyy");
		System.out.println("Format1: " + date.format(f5));
		System.out.println("----------------------------");
		//custom format for time
		LocalTime time = LocalTime.now();
		DateTimeFormatter f6 = DateTimeFormatter.ofPattern("hh-mm-ss a");
		System.out.println("Default: " + time);
		System.out.println("Format: " + time.format(f6));
		
		
		System.out.println("------------------------------"); 
		//date time format
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter f7 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' h:m:s a");
		System.out.println("Default: " + datetime);
		System.out.println("Format date/time: " + datetime.format(f7));
		
		//localize style
		System.out.println("------------------------------"); 
		DateTimeFormatter f8 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println("Default: " + date);
		System.out.println("Format: " + date.format(f8));
		System.out.println("Format1: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println("Format2: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		System.out.println("Format3: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
	}

}
