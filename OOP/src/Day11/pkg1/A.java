package Day11.pkg1;

public class A {
	private int i = 10;
	public void test() {//other inside class
		System.out.println("i: " + i);
//		private int a;//error
		i = 11;//can use only in this class
	}
}

