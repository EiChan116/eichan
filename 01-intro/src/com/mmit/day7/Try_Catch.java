package com.mmit.day7;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		try {
			var sc = new Scanner(System.in);
			
			System.out.print("Enter number 1: ");
			int num1 = sc.nextInt();
			System.out.print("Enter number 2: ");
			int num2 = sc.nextInt();
			
			
			//1. ArithmeticException e = new ArithmeticException
			//2. throw e;
			int res = num1 / num2;
			if(num2 == 0) {
				ArithmeticException obj = new ArithmeticException();//custom 
				
			}
			System.out.println("Result: " + res);
			
			sc.close();
		}catch(NullPointerException obj) {
			System.err.println("It doesn't allocate memory!");
		}catch(ArithmeticException obj) { // obj = e
			System.err.println(obj.getMessage());
		}
		System.out.println("Outside the try catch block!");

	}

}
