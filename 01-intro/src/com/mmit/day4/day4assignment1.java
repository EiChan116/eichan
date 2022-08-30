package com.mmit.day4;

import java.util.Scanner;
public class day4assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How may numbers you would like to type? ");
		int count = sc.nextInt();
		int num = 0; int zero=0, pos=0, neg=0;
		for(int i = 0; i < count; i++) {
			System.out.print("Enter any number: ");
			num = sc.nextInt();	
			if(num > 0) {
				pos++;
			}
			if(num < 0) {
				neg++;
			}
			if(num == 0) {
				zero ++;
			}
		}
		System.out.println("------------Result of Checking numbers-------------");
		System.out.println("Number of Zero is: "+ zero + " time(s)");
		System.out.println("Number of Positive number is: "+ pos + " time(s)");
		System.out.println("Number of Negative number is: "+ neg + " time(s)");
		
		sc.close();
		
		
	}

}
