package com.mmit.day6;

public class StringBuffer_Testing {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming");
		System.out.println("This is original buffer value: " + buffer);//Java Programming
		
		buffer.append(" language");
		System.out.println("After append, buffer value is: " + buffer);//Java Programming language
		
		buffer.insert(5, " is a ");
		System.out.println("After insert buffer: " + buffer);//Java  is a Programming language
		
		buffer.replace(0, 4, "php");
		System.out.println("After replace buffer: " + buffer);//php  is a Programming language

//		buffer.indexOf("Programming");
		System.out.println("Index of Programming is: " + buffer.indexOf("Programming"));//10
		
		System.out.println("Substring: " + buffer.substring(4));//is a Programming language
		
		System.out.println("Length of buffer: " + buffer.length());//30
		
		//delete
		buffer.delete(5, 9);
		System.out.println("After delete buffer is: " + buffer);
		System.out.println("Length is: " + buffer.length());
	}

}
