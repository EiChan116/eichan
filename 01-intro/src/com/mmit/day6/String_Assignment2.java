package com.mmit.day6;

import java.util.Scanner;

public class String_Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence you want to: ");
		String sentence = sc.nextLine();
		Boolean c = sentence.contains("?");
		Boolean how = sentence.contains("How");

		
		if(sentence.contains("?")) {
			System.out.println("-> This is question sentence.");
			
			if(sentence.contains("Have") || (sentence.contains("Haven't"))) {
				System.out.println("-> This sentence is not a simple present tense.");
			}
			else if(sentence.contains("Was") || (sentence.contains("Wasn't"))) {
				System.out.println("-> This sentence is not a simple present tense.");
			}
			else if(sentence.contains("Did") || (sentence.contains("Didn't"))) {
				System.out.println("-> This sentence is not a simple present tense.");
			}
			else {
				System.out.println("-> This sentence is a simple present tense.");
			}
		}
		else {
			System.out.println("->This is not question sentence.");
		}
		
		
	}

}
