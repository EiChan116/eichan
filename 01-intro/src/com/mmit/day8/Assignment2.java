package com.mmit.day8;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
//		String[] division = {"Sagaing", "Magwe", "Mandalay", "Tanintarye", "Pegu", "Iyyawaddi", "Yakhine State", "Kayar State", "Kachin State", "Mon State", "Shan State", "Yangon", "Kayin State", "Chin State",};
			System.out.println("Format of NRC");
			System.out.println("format 1 --> 00/AAAAAA(N or n or naing or Naing)000000 -> 12/madana(n)160505");
			System.out.println("format 2 --> 0/AAAAAA(N or n or naing or Naing)000000 -> 7/madana(n)404933");
			System.out.println();
			
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("How many Division you want to add? ");
			int num = sc.nextInt();
			sc.nextLine();


			if(num != 14) {
				throw new ArrayIndexOutOfBoundsException();
			}
			else {
				String[] division = new String[num];
				for( int i = 0; i < num; i ++ ) {
					System.out.print("Enter State and Division " + (i + 1) + ": ");
					division[i] = sc.nextLine();
				}
				System.out.println("Format 1 => 10/madana(n)160504");
				System.out.println("Format 2 => 7/latana(n)423455");
				System.out.println();
				
				System.out.println("Enter your nrc number: ");
				var nrc = sc.nextLine();
				String n = nrc.replaceAll("[^0-9]", "");
				int chk = n.length();
				if(chk == 8) {
					String[] state = {"10", "11", "12", "13", "14"};
					if(nrc.contains("(N)") || nrc.contains("(n)")) {
						System.out.println("Township: " + nrc.substring(3,9));
						System.out.println("Number: " + nrc.substring(12,18));
						if(nrc.contains("10")) {
							System.out.println("Division/State: " + division[9]);
						}
						else if(nrc.contains("11")) {
							System.out.println("Division/State: " + division[10]);
						}
						else if(nrc.contains("12")) {
							System.out.println("Division/State: " + division[11]);
						}
						else if(nrc.contains("13")) {
							System.out.println("Division/State: " + division[12]);
						}
						else if(nrc.contains("14")) {
							System.out.println("Division/State: " + division[13]);
						}
					}
					else if(nrc.contains("(naing)") || nrc.contains("(Naing")) {
						System.out.println("Township: " + nrc.substring(3,9));//10/madana(naing)444444
						System.out.println("Number: " + nrc.substring(16, 22));
						if(nrc.contains("10")) {
							System.out.println("Division/State: " + division[9]);
						}
						else if(nrc.contains("11")) {
							System.out.println("Division/State: " + division[10]);
						}
						else if(nrc.contains("12")) {
							System.out.println("Division/State: " + division[11]);
						}
						else if(nrc.contains("13")) {
							System.out.println("Division/State: " + division[12]);
						}
						else if(nrc.contains("14")) {
							System.out.println("Division/State: " + division[13]);
						}
					}
				}
				if(chk == 7) {
					String[] state = {"1", "2", "3", "4", "5"};
					if(nrc.contains("(N)") || nrc.contains("(n)")) {
						System.out.println("Township: " + nrc.substring(2,8));
						System.out.println("Number: " + nrc.substring(11,17));
						if(nrc.contains("1")) {
							System.out.println("Division/State: " + division[0]);
						}
						else if(nrc.contains("2")) {
							System.out.println("Division/State: " + division[1]);
						}
						else if(nrc.contains("3")) {
							System.out.println("Division/State: " + division[2]);
						}
						else if(nrc.contains("4")) {
							System.out.println("Division/State: " + division[3]);
						}
						else if(nrc.contains("5")) {
							System.out.println("Division/State: " + division[4]);
						}
						else if(nrc.contains("6")) {
							System.out.println("Division/State: " + division[5]);
						}
						else if(nrc.contains("7")) {
							System.out.println("Division/State: " + division[6]);
						}
						else if(nrc.contains("8")) {
							System.out.println("Division/State: " + division[7]);
						}
						else if(nrc.contains("9")) {
							System.out.println("Division/State: " + division[8]);
						}
					}
					else if(nrc.contains("(naing)") || nrc.contains("(Naing")) {
						System.out.println("Township: " + nrc.substring(2,8));//10/madana(naing)444444
						System.out.println("Number: " + nrc.substring(15, 21));
						if(nrc.contains("1")) {
							System.out.println("Division/State: " + division[0]);
						}
						else if(nrc.contains("2")) {
							System.out.println("Division/State: " + division[1]);
						}
						else if(nrc.contains("3")) {
							System.out.println("Division/State: " + division[2]);
						}
						else if(nrc.contains("4")) {
							System.out.println("Division/State: " + division[3]);
						}
						else if(nrc.contains("5")) {
							System.out.println("Division/State: " + division[4]);
						}
						else if(nrc.contains("6")) {
							System.out.println("Division/State: " + division[5]);
						}
						else if(nrc.contains("7")) {
							System.out.println("Division/State: " + division[6]);
						}
						else if(nrc.contains("8")) {
							System.out.println("Division/State: " + division[7]);
						}
						else if(nrc.contains("9")) {
							System.out.println("Division/State: " + division[8]);
						}
					}
				}
				
			}

		
		}catch (ArrayIndexOutOfBoundsException e) { //only accept exception class
			System.err.println("Your have to put 14 divisions, that is why Input nrc is INVALID!");
		}

	}


}

