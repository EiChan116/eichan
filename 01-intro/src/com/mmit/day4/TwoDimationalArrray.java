package com.mmit.day4;



public class TwoDimationalArrray {
	public static void main(String[] args) {
//		print_array();
		int marks[][] = {
				{100, 30, 90, 40, 50}, 
				{90, 90, 80, 70, 100},
				{70, 100, 90, 100, 100}
		};
		String[] names = {"Leon", "Yuri", "Cherry"};
		int row = marks.length;
		int col = marks[0].length;
		
		for(int r = 0; r < row; r++) {
			int total = 0;
			for(int c = 0; c < col; c++) {
				total += marks[r][c];
			}
			System.out.println("Total mark obtained by " + names[r] + ": " + total);
			System.out.println("Average mark: " + total/5.0 + "marks");
			System.out.println("--------------------------");
		}
		
	}

	private static void print_array() {
		int marks[][] = {
				{100, 30, 90, 40, 50}, 
				{90, 90, 80, 70, 100},
				{70, 100, 90, 100, 100}
		};
		System.out.println("----- Print with for looping ------");
		for(var r = 0; r < 3; r++) {//rows
			for(var c = 0; c < 5; c ++) {//columns
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
		System.out.println("------ Print with for each ------");
		for(int[] row : marks) {//row from array of marks
			for(int colMark : row) {//column from row(marks)
				System.out.print(colMark + "\t");
			}
			System.out.println();
		}
		
	}

}
