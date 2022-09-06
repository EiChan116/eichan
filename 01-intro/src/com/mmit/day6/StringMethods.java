package com.mmit.day6;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s2 = "Java Programming";
		String s1 = new String("mmit");
		System.out.format("s1: %s, s2: %s \n",  s1, s2);

		//substring => start - end(-1);
		String temp = s2.substring(0,3);
		System.out.println("Substring(0, 3) of 'Java Programming' is: " + temp);//Jav
		temp = s1.substring(2);
		System.out.println("Substring: " + temp);//it
		
		//replace
		temp = s2.replace("Java", "C++");
		System.out.println("Replace from Java to C++ of s2 is: " + temp);//C++ Programming
		temp = s1.replace("mmit", "SE");
		System.out.println("Using replace method of s1('mmit, SE') is: " + temp);//SE
		temp = s1.replace("i", "007");
		System.out.println("replace only 'i' if s1 is: " + temp);//mm007t
		temp = s2.replace("m", "M");
		System.out.println("replace s2: " + temp);//PrograMMing
		
		//concat
		s2.concat(" is a compile Language");
		temp = s2.concat(" is a complile langugage");
		System.out.println("answer of temp== " + temp);
		temp = s1.concat(" is a web developing language school. ");
		System.out.println(temp);
		
		//contain
		System.out.println("Java is Contain in var s2 or not? " + s2.contains("Java"));
		System.out.println("mmit is Contain in var s2 or not? " + s2.contains("mmit"));
		System.out.println("i is contain in var s1 or not? " + s1.contains("i"));
		System.out.println("ap is contain in var s2 or not? " + s2.contains("ap"));
		System.out.println("P is contain in var s2 or not? " + s2.contains("P"));//true
		System.out.println("MMIT is contain in var s1 or not: " + s1.contains("MMIT"));//false
		
		//find
		System.out.println("s2 start with 'Java'? " + s2.startsWith("Java"));//true
		System.out.println("s2 end with 'Programming? " + s2.endsWith("programming"));//false (p should be P to get true)
		System.out.println("s2 start with 'P'? " + s2.startsWith("J"));//true
		System.out.println("s2 start with 'P'? " + s2.endsWith("P"));//false
		System.out.println("s2 start with 'g'? " + s2.endsWith("g"));//true
		
		//locating(indexOf)
		int i = s2.indexOf("v");
		System.out.println("index of v of s2 var: " + i);
		i = s2.indexOf("g");
		System.out.println("index of g if var s2 is: " + i);// it has at index 8 place
		i = s1.indexOf("p");
		System.out.println("Index of p of s1 is: " + i);//-1 because no value
		
		//last indexOf(search from last)
		i = s2.lastIndexOf("g");
		System.out.println("Last index of Java Programming: " + i);//15
		i = s1.lastIndexOf("m");
		System.out.println("searching by last index to m of var s1: " + i);//1
		
		//split
		char[] output = s2.toCharArray();
		for(var v : output) {
			System.out.println("output of s2 is: " + v);
		}
		
		//trim space
		s2.split(" ");
		String[] array = s2.split(" ");
		for(var v : array) {
			System.out.println("Trim is: " + v);
		}
		
		String[] sprit = s2.split(" ");
		System.out.println("Split of value is: " + sprit);//[Ljava.lang.String;@161cd475
		System.out.println("Split of value is: " + Arrays.toString(sprit));
		char[] c = s2.toCharArray();
		System.out.println("Char array: " + c);//[C@532760d8
		System.out.println("Char arrayfor s2 is: " + Arrays.toString(c));//[J, a, v, a,  , P, r, o, g, r, a, m, m, i, n, g]
		char[] c1 = s1.toCharArray();
		System.out.println("Char array for s2 is: " + Arrays.toString(c1));//[m, m, i, t]
		
		//converting
		String rs = String.valueOf(s2);
		System.out.println(rs);
		rs = String.valueOf(1000);
		System.out.println("From int: " + rs);
		rs = String.valueOf(true);
		System.out.println("From boolean: " + rs);
	}

}
