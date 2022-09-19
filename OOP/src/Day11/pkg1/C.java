package Day11.pkg1;

public class C extends A{
	//int j = 10; j is default variable
	//protected k can use extends
	//public int x = 10;//because of public can in inheritance
	public void test() {
		System.out.println("j = " + j);//C is child of A
		System.out.println("k = " + k);//protected data can use via inheritance
		System.out.println("x = " + x);
	}
}
