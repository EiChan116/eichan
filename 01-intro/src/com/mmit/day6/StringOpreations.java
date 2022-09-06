package com.mmit.day6;

public class StringOpreations {

	public static void main(String[] args) {
		char[] data = {'y', 'w', 'k'};
		String s1 = new String (new char[] {'a','b','c'});
		String s2 = new String("Java Programming");
		String s3 = new String (data);
		String s4 = new String (new char[]{'a','g','r','o'});
		System.out.println("s4: " + s4);
		System.out.println("s3: " + s3);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("The length of s2: " + s2.length());
		System.out.println("To change lower case to s2: " + s2.toLowerCase());
		System.out.println("To Change upper case to s2: " + s2.toUpperCase());
		System.out.format("String s1: %s1, String s2: %s2\n", s1, s2);
		System.out.format("String s1 = %s, String s2 = %s " , s1, s2);
		
	}

}
