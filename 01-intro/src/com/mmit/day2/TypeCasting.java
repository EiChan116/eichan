package com.mmit.day2;

public class TypeCasting {

	public static void main(String[] args) {
		// data assign large to small
		int a = 200;
		long b = a; //implicit casting
		double c = a;//implicit casting
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		//data assign small to large(explicit)
		double d = 5.7;
		int e = (int) d;//explicit - changed by programmer
		System.out.println("d: " + d);
		System.out.println("e: " + e);
	}

}
