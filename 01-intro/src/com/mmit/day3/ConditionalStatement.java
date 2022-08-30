package com.mmit.day3;

import java.util.Scanner;
public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//language checking
		if_statement(sc);
		
		//login
		if_else_statement(sc);
		
		if_else_if_statement(sc);
		
		//close
		sc.close();
		
	}

	private static void if_else_if_statement(Scanner sc) {
		System.out.print("Enter your bmi value: ");
		var bmi = Float.parseFloat(sc.nextLine());
		
		if(bmi < 18.5) {
			System.out.println("Under weight!");
		}
		else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal weight!");
		}
		else if(bmi >=25 && bmi <= 29.9) {
			System.out.println("Over weight!");
		}
		else {
			System.out.println("Obesity!");
		}
		
	}

	private static void if_else_statement(Scanner sc) {
		System.out.println("----------------");
		System.out.print("Enter Email: ");
		var email = sc.nextLine();
		System.out.print("Enter password: ");
		var pw = sc.nextLine();
		
		if(email.equalsIgnoreCase("admin@gmail.com") && pw.equals("123")) {
			System.out.println("Login sucessful!");
		}
		else {
			System.out.println("Login failed!");
		}
		
	}

	private static void if_statement(Scanner sc) {
		System.out.print("Enter language name: ");
		String lgName = sc.nextLine();
		if(lgName.equalsIgnoreCase("Java")) {
			System.out.println("Java is a compiled language");
		}
		else {
			System.out.println("Other");
		}
		
	}
}
