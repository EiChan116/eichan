package com.mmit.day8;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		int[] num = {3, 5, 7, 9};
		
		/* try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter student mark: ");
			var mark = sc.nextInt();
			ValidateMark(mark);
		}catch (InvalidMarkException e) { //only accept exception class
			System.err.println( e.getMessage());
		}*/
	
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Enter array index: ");
			int index = sc.nextInt();
			if(index > num.length || index < num.length) {
				throw new IndexOutOfBoundsException();
			}
			Calculating("55", "77", "11", "33");
		}catch(IndexOutOfBoundsException e) {
			System.err.println("Array index out of bound.");
		}
	}
	public static void Calculating (String a, String b, String c, String d) {
		//convert string to integer
		String [] str = {"55", "77", "11", "33"};
		
	      int size = str.length;
	      int [] num = new int [size];
	      for(int i=0; i<size; i++) {
	         num[i] = Integer.parseInt(str[i]);
	      }
	      System.out.println("int[] num = " + Arrays.toString(num));
		
		//max
	      int max = num[0];
	      for(int i = 0; i < size; i++ ) {
			if(num[i] > max) {
				max = num[i];
			}
	      }
		//minimum
		int min = num[0];
		for(int i =0; i < size; i++ ) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		//average
		double avg; String tot = "";
		for(int i =0; i < size; i ++) {
			tot += num[i];
		}
		avg = Double.parseDouble(tot);
		
		//display
		System.out.println("Maximun number is: " + max);
		System.out.println("Minimun number is: " + min);
		System.out.println("Average value is: " + avg);
	}

}
