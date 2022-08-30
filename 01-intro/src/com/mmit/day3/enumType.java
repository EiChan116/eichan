package com.mmit.day3;
import java.util.Scanner;

public class enumType {
	enum Role {
		Admin, staff, Customer, Merchant // it keeps as integer even though you see they are strings
	};
	
	private static Role role;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Role.Customer);
		
		//new object
		Student obj = new Student();
		obj.name = "Kyaw Kyaw";
		obj.gender = gender.valueOf("Other");//gender.Male also can write
		
		System.out.println("Name: "+ obj.name);
		System.out.println("Gender: "+ obj.gender);
		
		sc.close();
	}
}

class Student {
	String name;
	gender gender;
}