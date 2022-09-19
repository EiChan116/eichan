package Day11.inheritance;

public class Person {
	//fields(variables)
	private String name;
	protected String phone;
//	public Person() {
//		
//	}
	public Person(String name, String ph) {
		this.name = name;
		this.phone = ph;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Phone number: " + phone);
	}

}
















