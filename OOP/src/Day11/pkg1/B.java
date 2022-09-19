package Day11.pkg1;

public class B {
	public void  test() {
		A obj = new A();
//		System.out.println("i =" + obj.i); can't use in this way to private variable i
		System.out.println("j = " + obj.j);//j can use default variable
		System.out.println("k = " + obj.k);//k is protected, can use via inheritance
		System.out.println("x = " + obj.x);
	}

}
