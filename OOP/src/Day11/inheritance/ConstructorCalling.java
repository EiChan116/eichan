package Day11.inheritance;

public class ConstructorCalling {

	public static void main(String[] args) {
//		B obj = new B();
		B obj = new B(100);
		
	}
}

class A {
//	public A() {
//		System.out.println("A's default constructor");
//	}
	public A(int a) {
		System.out.println("A's argument constructor");
	}
}

class B extends A{
	public B() {
		super(100);
		System.out.println("B's default constructor");
	}
	
	public B(int x) {
		super(x);
		System.out.println("B's argument constructor");
	}
}
class C {
	void test() {//class
		B obj = new B();
	}
}


