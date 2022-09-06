package com.mmit.day6;

import java.util.Arrays;

public class String_Assignment1 {

	public static void main(String[] args) {
		
		String paragraph = "NLP techniques are becoming widely popular scientific research areas as well as Information Technology industry. Language technology together with Information Technology can enhance the lives of people with different capabilities. This system implements voice command mobile phone dialer application. The strength of the system is that it can make phone call to the contact name written in either English or Myanmar scripts.";
		int count = paragraph.split("[.]+").length;//paragraph.split("[!?.:]+").length;
		System.out.println("Number of sentences of paragraph is: " + count);

		
		int numofWords = (paragraph.split("\\s+")).length; 
		System.out.println("Total wotds of paragraph is: " + numofWords);
		
		

	}

}
