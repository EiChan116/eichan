package com.mmit.day8;

import java.util.Scanner;

public class Throw_Exception {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int[] nums = {100, 200, 300};
			System.out.print("Enter index position: ");
			var index = sc.nextInt();
			//custom 
			if(index >= nums.length) {
				IndexOutOfBoundsException obj = new IndexOutOfBoundsException();
				throw obj;
				//for 1 sentence
//				throw new IndexOutOfBoundsException();
			}
			System.out.println("Value of index " + index +" is: " + nums[index]);
			}catch (Exception e) {
			System.err.println("Your input value is out of range!");
		}

	}

}
