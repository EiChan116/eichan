package com.mmit.day5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_Assignment1 {

	public static void main(String[] args) {
		
		int[]weekdayends = {1,2,3,4,5,6,7};
		LocalDate today = LocalDate.now();
		
//		LocalDate mon = today.plusDays(2);
//		var y = mon.getDayOfWeek().getValue();
		
		String dates = LocalDate.now().format(DateTimeFormatter.ofPattern("E, MMM dd yyyy"));
		var dayofW1 = today.getDayOfWeek().getValue();
		
		var chk = true;

		System.out.println(dates);
		System.out.println("* * * * * * * * * *");
		System.out.println();
		
		for(var i = 5; i< weekdayends.length; i++) {
			if(dayofW1 >= weekdayends[i]) {// 6, 7 >= 1-7 .. 5 >= 6,7
				System.out.println("Today is my Holiday," +"\n" + "but i can't hang out with my friends for a holiday,"+"\n" + "because i have bunch of assignemnts who asked to do by Tr.Wai :* XD");
				chk = false;
				break;
			}
		}
		if(chk == true) {
			System.out.println("I have no time," +"\n" + "I am stydying several programming languages!");
		}

	}

}


