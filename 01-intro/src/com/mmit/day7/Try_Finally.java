package com.mmit.day7;

import java.util.Scanner;

public class Try_Finally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Enter salary: ");
			int salary = sc.nextInt();
			if(salary == 0) {
				return;
			}
			System.out.println("Your salary is: " + salary);
			
		}
		finally {
			sc.close();
			System.out.println("It is always executed!");
		}
		System.out.println("Outside try-finally block");

	}

}
