package com.mmit.day8;

public class Throws_Sample {

	public static void main(String[] args) {
		try {
			checkMrk(101);
		}catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void checkMrk(int i) throws ArithmeticException {
		if( i < 0 || i > 100 ) {
			ArithmeticException obj = new ArithmeticException("Invalid Mark!");
			throw obj;
		}
		
	}

}
