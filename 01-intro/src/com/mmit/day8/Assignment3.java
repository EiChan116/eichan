package com.mmit.day8;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter student mark: ");
			var mark = sc.nextInt();
			ValidateMark(mark);
		}catch (InvalidMarkException e) { //only accept exception class
			System.err.println( e.getMessage());
		}

	}
	private static void ValidateMark(int m) throws InvalidMarkException {
		if(m < 0 || m > 100) { //if(mark < 0 || mark > 100, then throws 
			InvalidMarkException obj = new InvalidMarkException("Invalid mark, please try again");
			throw obj;
		}
		else {
			System.out.println("Correct mark entry!");
			if(m > 0 && m < 50) {
				System.out.println("This student mark is " + m + ". It is Fail!");
			}
			else if(m >=50 && m < 65) {
				System.out.println("This student mark is " + m + ". Pass!");
			}
			else if(m >=65 && m <80) {
				System.out.println("This student mark is " + m + ". It is Creit!");
			}
			else if(m >=80 && m <=100) {
				System.out.println("This student mark is " + m + ". It is Distinction!");
			}
		}
	}

}

class InvalidMarkException extends Exception {

	public InvalidMarkException (String msg) {
		super(msg);
	}
	
}

