package com.mmit.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//import java.io.Scanner()
public class UserInputScanner {

	public static void main(String[] args) throws IOException {
		readWithScanner();
	}

	private static void readWithScanner() {
		//open
		Scanner sc = new Scanner(System.in);
		//operate
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.print("Enter ph number: ");
		String ph = sc.nextLine();
		System.out.print("Enter education: ");
		String edu = sc.nextLine();
		System.out.print("Enter income: ");
		double income = sc.nextDouble();//return double
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter city: ");
		String city = sc.nextLine();
		//close
		sc.close();
		
		//output display
		System.out.println("-----------Info-------------");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Contact number: " + ph);
		System.out.println("Education: " + edu);
		System.out.println("Income: " + income);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
	}

}
