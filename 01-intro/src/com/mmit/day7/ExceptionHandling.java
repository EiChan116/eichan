package com.mmit.day7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//		var sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1 = Integer.parseInt(sc.readLine());
		System.out.println("Enter num2: ");
		int num2 = Integer.parseInt(sc.readLine());
		
		int result = num1 / num2;
		System.out.println("Result: " + num1 / num2);
		
		sc.close();

	}

}
