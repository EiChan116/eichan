package com.mmit.day4;

import java.util.Scanner;

public class Day4Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = -1; double exchange = 3000.05; double price = 0.00;
		String[] brands = {"","lenovo", "hp", "samsung", "acer", "dell", "asus"};
		
		String[] processer = {"corei3", "corei5", "corei7", "corei9"};
		double[][] prices = {
				{230.21, 400.21, 294.20, 693.33, 340.44, 691.99},
				{529.483, 920.483, 676.66, 1594.659, 783.012, 1591.577},
				{552.504, 960.504, 706.080, 1663.992, 817.056, 1660.776},
				{690.63, 1200.63, 882.6, 2079.99, 1021.32, 2075.97}
		};
		System.out.println("------------------------------ Price list by Processer -----------------------------------");
		System.out.println();
		for(var brand : brands) {

			System.out.print(brand + "\t\t");
		}System.out.println();
		System.out.println();
		for(int r = 0; r < 4; r ++) {
			System.out.print(processer[r]+"     \t");
			for(int c = 0; c < 6; c++) {
				System.out.print(prices[r][c] + "     \t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.print("Enter the brand you want to search: ");
		String b = sc.nextLine();
		

		for(int i = 0; i < brands.length; i ++) {
			if(b.equals(brands[i])) {

				System.out.println( brands[i] + " brand is available."); 
				System.out.println("---------------------------");
				temp = i;
				
				break;
			}
		}
		if(temp == -1) {
			System.out.println(b + " is not available.");
		}
		
		System.out.print("Enter the processer you want to search: ");
		String p = sc.nextLine();
		
		for(int i = 0; i < processer.length; i++) {
			if(p.equals(processer[i])) {
//				
				System.out.println(p + " is available.");
				System.out.println("---------------------------");
				temp = i;
				System.out.print("Please retype the brand name that you chose above: ");
				String a = sc.nextLine();
				System.out.println();
				if("lenovo".equals(a)) {
					price = prices[i][0];
					System.out.println("The original price is: $ " + price + "!");
					System.out.println();
				}
				else if("hp".equals(a)) {
					price = prices[i][1];
					System.out.println("The original price is: $ " + price + "!");
				}
				if("samsung".equals(a)) {
					price = prices[i][2];
					System.out.println("The original price is: $ " + price + "!");
				}
				else if("acer".equals(a)) {
					price = prices[i][3];
					System.out.println("The original price is: $ " + price + "!");
				}
				if("dell".equals(a)) {
					price = prices[i][4];
					System.out.println("The original price is: $ " + price + "!");
				}
				else if("asus".equals(a)) {
					price = prices[i][5];
					System.out.println("The original price is: $ " + price + "!");
				}
				
				System.out.println("Exchange rate: $1 = " + exchange +" Ks.");
				System.out.println("Price of item is (" + price + " * " + exchange + ") = " + price * exchange + " Ks.");
				
				break;
			}
		}
		if(temp == -1) {
			System.out.println(p + " is not available.");
		}
		
		System.out.println();
		System.out.println("Thank you for your purchase....");
		
		

		sc.close();
	}

}
