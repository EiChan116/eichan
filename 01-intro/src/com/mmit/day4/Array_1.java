package com.mmit.day4;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) {
		int arr1[] = {
				100, 20, 200, 40, 90
		};
		for(int a : arr1) {
			System.out.println(a);
		}
		
		//copy
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("After copied, arr2 became: " + Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("This is copy of range: " + Arrays.toString(arr3));
		
		//equals
		System.out.println("arr1 == arr2: " + Arrays.equals(arr1, arr2));
		System.out.println("arr1 == arr3: " + Arrays.equals(arr1,  arr3));
		
		//sorting
		Arrays.sort(arr1);
		System.out.println("After sorting of arr1: " + Arrays.toString(arr1));
		
		//searching
		System.out.println("Contain 90 in arr1?: " + (Arrays.binarySearch(arr1, 90) < 0 ? "false" : "true"));
		System.out.println("Contain 190 in arr1?: " + (Arrays.binarySearch(arr1, 190) < 0 ? "false" : "true"));
		
		//filling
//		Arrays.fill(arr1, 7);
//		System.out.println("After filling 7, arr1 is: " + Arrays.toString(arr1));
		
		int total = Arrays.stream(arr1).sum();
		System.out.println("Total is: " + total);
		
		int max = Arrays.stream(arr1).max().getAsInt();
		int min = Arrays.stream(arr1).min().getAsInt();
		double avg = Arrays.stream(arr1).average().getAsDouble();
		System.out.println("Maximun in arr1[] is: " + max);
		System.out.println("Minimun in []arr1 is: " + min);
		System.out.println("Average of the value of []arr1 is: " + avg);
		
		//filling
		Arrays.fill(arr1, 7);
		System.out.println("After filling 7, arr1 is: " + Arrays.toString(arr1));
		
		//change value
		System.out.println("Before function calling: " + Arrays.toString(arr1));
		changeValue(arr1);
		System.out.println("After function calling: " + Arrays.toString(arr1));
		
		//changing data by String
		String data = "Aung Aung";
		System.out.println("Before changing data: " + data);
		change(data);
		System.out.println("After changing data: " + data);
		
		Song s = new Song(); //call by reference(object, array, etc..)
		s.name = "X-Japan";
		System.out.println("Before Song class, name: " + s.name);
		passObject(s);
		System.out.println("After calling method is: " + s.name);
		
	}

	private static void passObject(Song songObj) {
		songObj.name = "Headache";
		System.out.println("Inside method() name is: " + songObj.name);
		
	}

	private static void change(String data) {
		data = "Leon";
	}

	private static void changeValue(int[] input) {
		input[1] = 100;	
	}
}

class Song {
	String name;
}
