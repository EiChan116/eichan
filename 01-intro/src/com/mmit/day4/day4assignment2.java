package com.mmit.day4;

import java.util.Scanner;
public class day4assignment2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totHours;
		System.out.println("Notic! Please type between 1 to 12 for this program.");
		System.out.println("-------------------");
//		start:
		System.out.print("Enter get into sleep time: ");
		int getinSleep = sc.nextInt();
		
		System.out.print("Enter get up time: ");
		int getUp = sc.nextInt();
		
		if(getinSleep <13 && getinSleep > 0 && getUp <13 && getUp > 0)
		{
			if(getinSleep >=1 && getinSleep <=12 && getUp >=1 && getUp <=12) {
				if(getUp > getinSleep) {
					totHours = getUp - getinSleep;
					System.out.println("You sleep from " + getinSleep +" to " + getUp +".");
					System.out.println("You rest " + totHours + " hours.");
					System.out.println("--------------------");
					if(totHours >= 5 && totHours <= 8) {
						System.out.println("You take care your health well!");
					}
					else if(totHours < 5) {
						System.out.println("You are very hardworking!");
					}
					else if(totHours > 8) {
						System.out.println("You are abnormal!");
					}
					
				} 
				else if(getUp < getinSleep) {
					totHours = (12 - getinSleep) + getUp;
					System.out.println("You sleep from " + getinSleep +" to " + getUp);
					System.out.println("You rest " + totHours + " hours.");
					System.out.println("-------------------");
					if(totHours >= 5 && totHours <= 8) {
						System.out.println("You take care your health well!");
					}
					else if(totHours < 5) {
						System.out.println("You are very hardworking!");
					}
					else if(totHours > 8) {
						System.out.println("You are abnormal!");
					}
				}
				else if(getUp == getinSleep) {
					totHours = 12;
					System.out.println("You sleep from " + getinSleep +" to " + getUp+ ".");
					System.out.println("You rest " + totHours + " hours.");
					System.out.println("--------------------");
					System.out.println("You are abnormal!");
				}
			}
		}
		else {
			System.out.println("Invalid time input!");
			
		}
		sc.close();		
	}	
}
