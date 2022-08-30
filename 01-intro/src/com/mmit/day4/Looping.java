package com.mmit.day4;

public class Looping {
	public static void main(String[] args) {
		String[] lg = {
				"java", "C", "SQL", "php", "asp.net"
		};
		
		//for each loop
		for(String lang:lg) {
			if("php".equalsIgnoreCase(lang))
				break;
			System.out.println(lang);
		}
	}
}
