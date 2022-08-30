package com.mmit.day3;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food name: ");
		String name = sc.nextLine().toLowerCase();
		String category = null;
		
		switchStatement(name);
		yieldStatement(name);
		
		sc.close();

	}

	private static void yieldStatement(String name) {
		String category =  switch(name) {
		case "Coffee", "Yogurt" -> {
			
			if(name.equals("Coffee"))
				System.out.println("Coffee is sweet. ");
			yield "Dessert";
		}
		case "Sushi" -> {
			yield "Japanese food";
		}
		case "Pizza" -> "Italian food";
		default -> "unknown";
		};
		
		System.out.print(name + " is " + category);
		
	}

	private static void switchStatement(String name) {
		String category;
		
		switch(name) {
		case "Coffee","Yogurt":
			category = "Dessert";
			break;
			
		case "Sushi":
			category = "Japanese food";
			break;
			
		case "Pizza", "Hunburger":
			category = "Fast food";
			break;

		default:
			category = "Unknown";
		}
		System.out.println(name + " is " + category);
		
	}

}
