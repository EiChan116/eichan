package day10;

public class SingeltonClass {//top level class 
	//nested class
	class A {//seldom see this type
		//can use private, public, protected and default
	}
	
	//private, public, protected, default(integer a)
	private int a;
	protected int b;
	public int x;
	int y;
	public static void main(String[] args) {
		var obj1= DatabaseConfig.getInstance();
		System.out.println("obj1 's db name: " + obj1.db_name);
		
		var obj2 = DatabaseConfig.getInstance();
		System.out.println("obj2 's db name: " + obj2.db_name);
		
		obj2.db_name = "student_db";
		
		System.out.println("obj2 's db name: " + obj2.db_name);
		System.out.println("obj1 's db name: " + obj1.db_name);
	}
}

class DatabaseConfig {//public and default only can use, protected and private can not use
	String db_name = "employee_db";
	
	//static field to hold object
	private static DatabaseConfig config = null;
	
	//static constructor
	private DatabaseConfig() {
		
	}
	
	//static method to return
	public static DatabaseConfig getInstance() {
		if(config == null) 
			config = new DatabaseConfig();
		return config;
	}
	
}