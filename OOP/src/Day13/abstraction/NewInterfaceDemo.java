package Day13.abstraction;

public class NewInterfaceDemo {
	public static void main(String[] args) {
		var obj = new myClass();
		
		obj.method1();
		obj.method2();
		
		//obj.method3 or NewInterface.method2();
		NewInterface.method3();
		obj.method4();
	}
}
