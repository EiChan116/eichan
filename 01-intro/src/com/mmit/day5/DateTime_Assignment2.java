package com.mmit.day5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class DateTime_Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalTime now = LocalTime.now();
		LocalDate dates = LocalDate.now();

//		DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:m:s a");
//		System.out.println(now.format(f));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
		DateTimeFormatter justDate = DateTimeFormatter.ofPattern("MMM dd yyyy");
		
		System.out.println( dates.getDayOfWeek() + ", " + dates.format(justDate));
		 
		LocalTime t1 = LocalTime.now().plusMinutes(15);
		LocalTime t2 = LocalTime.now().plusMinutes(30);
		LocalTime t3 = LocalTime.now().plusMinutes(10);
		LocalTime t4 = LocalTime.now().plusMinutes(45);
		 
		String min1 = t1.format(formatter);
		String min2 = t2.format(formatter);
		String min3 = t3.format(formatter);
		String min4 = t4.format(formatter);
//		System.out.println("This is time testing t1:  "+ min1);
		
		LocalDate day1 = LocalDate.now().plusDays(1);
		LocalDate day2 = LocalDate.now().plusDays(2);
		LocalDate day3 = LocalDate.now().plusDays(3);
		LocalDate day4 = LocalDate.now().plusDays(4);
		LocalDate day5 = LocalDate.now().plusDays(5);
		
//		DateTimeFormatter d = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//		System.out.println("LONG format: " + justDate.format(day4));
	
		String d1 = justDate.format(day1);
		String d2 = justDate.format(day2);
		String d3 = justDate.format(day3);
		String d4 = justDate.format(day4);
		String d5 = justDate.format(day5);
 		
		String[] minutes = {min1, min2, min3, min4};
		String[] deliverDate = {d1, d2, d3, d4, d5};
//		for(int i = 0; i < 5; i ++) {
//			System.out.println("deliver date" + deliverDate[i]);
//		}
		
		
		String[] township = {"Dagon", "Takayta", "Tingankyun", "Latha"};
		String[] mins = {"(15 mins)", "(30 mins)", "(10 mins)", "(45 mins)"};
		int[] arrivedTime = {15, 30, 10, 45,};
		String[] menus = {"Pizza", "Burger", "Milk Tea", "Spicy Noddle"};
		String[] orderType = {"Order Now?", "Preorder?"};
		
		
		
		System.out.println("***** Available Menu *****");
		for(int i = 0; i < township.length; i++ ) {
			System.out.println((i+1)+". " + menus[i]);
		}
		System.out.print("Please choose Item: ");
		int foods = sc.nextInt();
		if(foods > 4 || foods < 1) {
			System.out.print("Incorrect entry, please choose between 1 to 4.");
			foods = sc.nextInt();
		}
		
		
		System.out.println("---------------------------------------------");
		System.out.println();
		
		
		//deliverable township
		System.out.println("***** Deliverable Township *****");
		for(int i = 0; i < township.length; i++ ) {
			System.out.println((i+1) + ". " + township[i] + " " + mins[i]);
		}
		System.out.print("Please choose township to deliver: ");
		int deli = sc.nextInt();
		if(deli > 4 || deli < 1) {
			System.out.print("Incorrect data entry, please choose between 1 to 4: ");
			deli = sc.nextInt();
		}
		System.out.println("---------------------------------------------");
		System.out.println();
		
		//order
		System.out.println("***** Order Type *****");
		for(int i = 0; i < 2; i ++) {
			System.out.println((i+1) + ". " + orderType[i]);
		}
		System.out.print("Please choose 1 or 2? ");
		int order = sc.nextInt();
		System.out.println("---------------------------------------------");
		System.out.println();
		if(order > 2 || order < 1) {
			System.out.print("You entered invalid order number, please choose 1 or 2: ");
			order = sc.nextInt();
			System.out.println("---------------------------------------------");
			System.out.println();
		}
	
		
		
		if(order == 1) {
			System.out.println("***** Your Order Information *****");
			for(int i = 0; i < 4; i ++) {
				if(foods == 1 && (deli == (i + 1))) {
					System.out.println("Item Name: " + menus[0]);
					System.out.println("Your address: " + township[i]);
					System.out.println("Duration: " + mins[i]);
					System.out.println("Arrival Time: " + minutes[i]);
					System.out.println("******* Thank you for your ordering *******");
				}
				else if(foods == 2 && (deli == (i + 1))) {
					System.out.println("Item Name: " + menus[1]);
					System.out.println("Your address: " + township[i]);
					System.out.println("Duration: " + mins[i]);
					System.out.println("Arrival Time: " + minutes[i]);
					System.out.println("******* Thank you for your ordering *******");
				}
				else if(foods == 3 && (deli == (i + 1))) {
					System.out.println("Item Name: " + menus[2]);
					System.out.println("Your address: " + township[i]);
					System.out.println("Duration: " + mins[i]);
					System.out.println("Arrival Time: " + minutes[i]);
					System.out.println("******* Thank you for your ordering *******");
				}
				else if(foods == 4 && (deli == (i + 1))) {
					System.out.println("Item Name: " + menus[3]);
					System.out.println("Your address: " + township[i]);
					System.out.println("Duration: " + mins[i]);
					System.out.println("Arrival Time: " + minutes[i]);
					System.out.println("******* Thank you for your ordering *******");
				}
			
			}
		}
		if(order == 2) {
			System.out.println();
			System.out.print("Enter your deliver date(only available 5 days): ");
			int deliDate = sc.nextInt();
			System.out.println();
			if(deliDate < 1 || deliDate > 5) {
				System.out.print("Sorry, we are not available for " + deliDate + " days. Please retype again: ");
				deliDate = sc.nextInt();
				System.out.println();
			}
			System.out.println("******* Your Order Information *******");
			if(deliDate == 1 ) {
				for(int i = 0; i < 4; i ++) {
					if(foods == 1 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[0]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: "+ dates.getDayOfWeek().plus(1) + ", " + deliverDate[0]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 2 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[1]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(1) + ", " + deliverDate[0]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 3 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[2]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(1) + ", " + deliverDate[0]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 4 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[3]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(1) + ", " + deliverDate[0]);
						System.out.println("******* Thank you for your ordering *******");
					}
				}
			}
			if(deliDate == 2 ) {
				for(int i = 0; i < 4; i ++) {
					if(foods == 1 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[0]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(2) + ", " + deliverDate[1]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 2 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[1]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(2) + ", " + deliverDate[1]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 3 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[2]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(2) + ", " + deliverDate[1]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 4 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[3]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(2) + ", " + deliverDate[1]);
						System.out.println("******* Thank you for your ordering *******");
					}
				}
			}
			if(deliDate == 3 ) {
				for(int i = 0; i < 4; i ++) {
					if(foods == 1 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[0]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(3) + ", " + deliverDate[2]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 2 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[1]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(3) + ", " + deliverDate[2]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 3 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[2]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(3) + ", " + deliverDate[2]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 4 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[3]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(3) + ", " + deliverDate[2]);
						System.out.println("******* Thank you for your ordering *******");
					}
				}
			}
			if(deliDate == 4 ) {
				for(int i = 0; i < 4; i ++) {
					if(foods == 1 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[0]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(4) + ", " + deliverDate[3]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 2 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[1]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(4) + ", " + deliverDate[3]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 3 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[2]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(4) + ", " + deliverDate[3]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 4 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[3]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(4) + ", " + deliverDate[3]);
						System.out.println("******* Thank you for your ordering *******");
					}
				}
			}
			if(deliDate == 5 ) {
				for(int i = 0; i < 4; i ++) {
					if(foods == 1 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[0]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(5) + ", " + deliverDate[4]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 2 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[1]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(5) + ", " + deliverDate[4]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 3 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[2]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(5) + ", " + deliverDate[4]);
						System.out.println("******* Thank you for your ordering *******");
					}
					if(foods == 4 && (deli == (i + 1))) {
						System.out.println("Item Name: " + menus[3]);
						System.out.println("Your address: " + township[i]);
						System.out.println("Arrival Date: " + dates.getDayOfWeek().plus(5) + ", " + deliverDate[4]);
						System.out.println("******* Thank you for your ordering *******");
					}
				}
			}
		}
		
		
		
		sc.close();
	}

}
