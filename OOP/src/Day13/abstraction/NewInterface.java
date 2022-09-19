package Day13.abstraction;

public interface NewInterface {
	
	//abstract method
	void method1();
	
	//this is another feature, default method can override
	default void method2() {
		System.out.println("This is default method2..");
	}
	default void method4() {
		System.out.println("This is default method3..");
	}
	//this static method can't make override.
	static void method3() {
		System.out.println("This is static method...");
	}
	
	//private method(can't access from inheritance class
	
}

class myClass implements NewInterface {

	@Override
	public void method1() {
		System.out.println("This is my own method... ");
	}
	
	@Override
	public void method2() {
		System.out.println("This is override method...");
	}
	
//	@Override
//	public void method4() {
//		System.out.println("This is override method..");
//	}
	
//	@Override
//	public void method2() { //method2 can't override
		
	
}
