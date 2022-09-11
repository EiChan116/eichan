package day10;

public class Person {
	String name;
	int age;
	boolean isSingle;
	
	//default constructor
	public Person() {
		
	}
	//parameter constructor
	public Person(String name, int age, boolean isS) {
		super();
		this.name = name;
		this.age = age;
		this.isSingle = isS;
	}

	//method
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Is single? " + ((isSingle) ? "yes" : "no"));
	}
}
