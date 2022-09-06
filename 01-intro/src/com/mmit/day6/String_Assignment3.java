package com.mmit.day6;

import java.util.Scanner;

public class String_Assignment3 {

	public static void main(String[] args) {
		String nrc;
		Scanner sc = new Scanner(System.in);
		System.out.println("NRC sample format");
		System.out.println("------------------------------");
		System.out.println("1-> 00/aaaaaa(N)000000.  You can use (N) or (n) or (naing) or (Naing)");
		System.out.println("2-> 0/aaaaaaa(N)000000.  You can use (N) or (n) or (naing) or (Naing)");
		System.out.print("Please Enter nrc number correctly: ");
		nrc = sc.nextLine();
		String n = nrc.replaceAll("[^0-9]", "");
		int num = n.length();
		if(num == 8) {
			if(nrc.contains("(N)") || nrc.contains("(n)")) {
				System.out.println("Township: " + nrc.substring(3,9));
				System.out.println("Number: " + nrc.substring(12,18));
			}
			else if(nrc.contains("(naing)") || nrc.contains("(Naing")) {
				System.out.println("Township: " + nrc.substring(3,9));
				System.out.println("Number: " + nrc.substring(16, 22));
			}
			else {
				System.out.println("Invalid nrc format of input.");
			}
		}
		else if(num == 7 ) {
			
			if(nrc.contains("(N)") || nrc.contains("(n)")) {
				System.out.println("Township: " + nrc.substring(2,9));
				System.out.println("Number: " + nrc.substring(12,18));
			}
			else if(nrc.contains("(naing)") || nrc.contains("(Naing)")) {
				System.out.println("Township: " + nrc.substring(2,9));
				System.out.println("Number: " + nrc.substring(16, 22));
			}
			else {
				System.out.println("Invalid nrc card format of input.");
			}
		}
		else {
			System.out.println("Invalid nrc card format of input.");
		}
		


	}

}
