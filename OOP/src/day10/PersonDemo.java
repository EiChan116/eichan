package day10;

public class PersonDemo {
public static void main(String[] args) {
	var person1 = new Person();//with default constructor 
	var person2 = new Person("Cherry", 20, true);//using parameter constructor
	
	System.out.println("This is using default constructor");
	person1.display();
	System.out.println();
	System.out.println("This is using parameter constructor.");
	person2.display();
}
}
