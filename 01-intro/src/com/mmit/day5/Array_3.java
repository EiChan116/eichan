package com.mmit.day5;

public class Array_3 {

	public static void main(String[] args) {
		int[][] data = {
				{1, 56, 89},
				{99, 71, 77, 34},
				{90}
		};
		System.out.println("------- for looping -------");
		System.out.println();
		for(int row = 0; row < data.length; row++ ) {
			for(int col = 0; col < data[row].length; col++ ) {
				System.out.print(data[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------- for each loop -------");
		System.out.println();
		for(int[] row : data) {
			for(int value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}
