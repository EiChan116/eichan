package day9;

public class Phone {


		//fields
		String brands;
		String color;
		int price;
		
		//constructors
		public Phone(String phoneBrand, String phoneColor, int phonePrice) {
			this.brands = phoneBrand;
			this.color = phoneColor;
			this.price = phonePrice;
		}
		
		//methods (instant method), if no static keywords include
		public void call() {
			System.out.println("This is ph calling method!");
		}
		
		public void sendSMS() {
			System.out.println("This is sending sms method!");
		}
	
		public static void main(String[] args) {// main() better make demo class for testing
			//creating object
			Phone obj; //declare
			obj = new Phone("iPhone", "white", 3100000);//create object
			
			Phone obj2 = new Phone("Samsung", "blue", 3200000);
			
			System.out.println("------- Obj1's data -------");
			System.out.println("Brand: " + obj.brands);//added data taking from constructor
			System.out.println("Color: " + obj.color);
			System.out.println("Price: " + obj.price);
			System.out.println();
			obj.call();
			obj.sendSMS();
			
			System.out.println("------- Obj2's data -------");
			System.out.println("Brand: " + obj2.brands);//added data taking from constructor
			System.out.println("Color: " + obj2.color);
			System.out.println("Price: " + obj2.price);
			obj2.call();
			obj2.sendSMS();
		}
}
