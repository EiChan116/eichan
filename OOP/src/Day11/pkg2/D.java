package Day11.pkg2;

import Day11.pkg1.A;

public class D {
	
	public void test() {
		A obj = new A();
//		System.out.println("j " + obj.j); can't because different package
//		System.out.println("j = " + obj.k); can't use because of different package. not take inheritance
		System.out.println("x = " + obj.x);
	}
}
