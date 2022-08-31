package com.mmit.day6;

public class StringOpreations {

	public static void main(String[] args) {
		char[] data = {'y', 'w', 'k'};
		String s1 = new String(data);
		String s2 = "Java programming";
		
		System.out.format("String1 = %S, String2 = %s\n", s1, s2);
		System.out.println("No of chars in s1: " + s1.length());;
		System.out.println("No of chars in s2: " + s2.length());
		
		
	}

}
