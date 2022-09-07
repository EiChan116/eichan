package com.mmit.day8;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age: ");
			var age = sc.nextInt();
			ValidateAge(age);
		}catch (InvalidAgeException e) { //only accept exception class
			System.out.println("Message: " + e.getMessage());
		}

	}
	private static void ValidateAge(int age) throws InvalidAgeException {
		if(age < 18) { //if(age < 18, do throws 
			InvalidAgeException obj = new InvalidAgeException("Invalid age");
			throw obj;
		}
		else {
			System.out.println("You can smoke!");
		}
	}

}

class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;
	public InvalidAgeException() {
		
		super("Unknown message");
		System.out.println("...default constructor");
	}
	public InvalidAgeException (String msg) {
		super(msg);
	}
	
}
