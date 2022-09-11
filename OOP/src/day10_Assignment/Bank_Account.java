package day10_Assignment;

import java.util.Scanner;

public class Bank_Account {
	Scanner sc = new Scanner(System.in);
	//fields
	int acc_no = 0;
	String acc_holder;
	String acc_pw;
	String pin_no = "123456";
	static int balance = 1000;
	
	//constructor
	public Bank_Account() {
		
	}
	public Bank_Account(int accNo, String accHolder, String pw, String pin) {
		this.acc_no = accNo;
		this.acc_holder = accHolder;
		this.acc_pw = pw;
		this.pin_no = pin;
	}

	//deposit
	public void deposit(int deposit) {

			balance += deposit;
			System.out.println("Your balance is: " + balance);
			
	}
	//withdraw
	public void withdraw(int bal, int amt) throws AppException {

		if(amt > bal) {
			throw new AppException("Sorry, not enough the balance to withraw. ");
		}
		else {
			balance = bal - amt;
			
			System.out.println("Blance: " + balance);
			System.out.println();
		}
	}
	//change password
	public void changePassword () {
		System.out.println("Would like to change my password.");
		System.out.print("Enter your pin no: ");
		String input_pno = sc.nextLine(); 
			if(pin_no.equals(input_pno)) {
				System.out.println("Correct pin number.");
				System.out.print("Please enter your new password to change: ");
				String pw = sc.nextLine();
				System.out.println("Your new password is: " + pw);
				acc_pw = pw;
				System.out.println();
			}
			else {
				do {
					System.out.println("Incorrect pin number");
					System.out.print("Please re-type: ");
					input_pno = sc.nextLine();
				}while(!input_pno.equals(pin_no));
			
			System.out.println("Correct pin number.");
			System.out.print("Please enter your new password to change: ");
			String pw = sc.nextLine();
			System.out.println("Your new password is: " + pw);
			acc_pw = pw;
			System.out.println();
			}
		}
	

	//show info 

		public void showInfo() {
			System.out.println(acc_no + "\t" + acc_holder + "\t\t" + acc_pw + "\t" + pin_no + "\t" + balance);
		
	}
		
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			int input_deposit, new_balance, new_amt;
			
			//create object
			Bank_Account b1;
			b1 = new Bank_Account(10099, "Toyoda Yasuhiro", "123", "123456");
//			System.out.println("Please set pin no: ");
//			input_pno = sc.nextLine();
			System.out.println(b1.acc_holder + "'s Current balance = " + balance);
			//deposit
			System.out.print("Enter your deposit amt: ");
			input_deposit = sc.nextInt();
			
			b1.deposit(input_deposit);
			new_balance = balance;
			System.out.println("new balance: " + new_balance);
			
			System.out.println("AccNo\tName\t\t" +"   " +"Password\tPinNo\tBalance");
			b1.showInfo();
			System.out.println("-------------------------");
			
			try {

				//withdraw
				System.out.print("Enter your withraw amt: ");
				new_amt = sc.nextInt();
				b1.withdraw(new_balance, new_amt);
				System.out.println("AccNo\tName\t\t" +"   " +"Password\tPinNo\tBalance");
				b1.showInfo();
				System.out.println("-------------------------");

				System.out.println();
				
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
	
			//change password

			b1.changePassword();
			
			System.out.println("----------- Update banck account infomation -----------");
			System.out.println();
			System.out.println("AccNo\tName\t\t" +"   " +"Password\tPinNo\tBalance");
			b1.showInfo();
			
			sc.close();
		}

}





