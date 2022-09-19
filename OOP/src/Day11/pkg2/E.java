package Day11.pkg2;

import Day11.pkg1.A;

public class E extends A{
	public void test() {
		//protected int k = 10;(from class A)
		System.out.println("k = " + k);//ok, k is protected type, it can use because of child class
		System.out.println("x = " + x);
		
		A obj = new A();//to access 
//		System.out.println("i = " + obj.k); protected can't use via object
		System.out.println("x = " + obj.x);
	}
}
