package sub.pkg;
import java.util.Scanner;

public class ConstantVar {
	
	static final float RATE = 1.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		
		if(price < 500) {
			price = MIN_PRICE;
			
			System.out.println("Price: " + price);
			System.out.println("Expense: "+ (price * RATE));
			
			
		}
		
		
	}

}
