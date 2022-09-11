package day10;

public class ConstructorChain {

	//two argument constructor
	public ConstructorChain(int x, int y) {
		System.out.println("This is two argument constructor.");
	}
	
	//one argument constructor
	public ConstructorChain(int i) {
		System.out.println("This is one argument constructor.");
	}
	
	//default constructor
	public ConstructorChain() {
		this(100);//1 argument constructor calling statement
		System.out.println("This is zero(default) argument constructor.");
	}
	
	//main
	public static void main(String[] args) {
//		var obj1 = new ConstructorChain();
		var obj = new Teachers("Mr.Leon", "Tutor");
		System.out.println("Name: " + obj.getName());
		System.out.println("Positin: " + obj.getPosition());
	}
}


class Employees {
	private String name;
	
	//default
	public Employees() {
		
	}
	
	//1 argument
	public Employees(String name) {
		this.name = name;
	}
	
	//to get name 
	public String getName() {
		return name;
	}
}

class Teachers extends Employees{
		private String position; //own data
		
		
		//constructor
		public Teachers(String name, String position) {
			super(name);
			this.position = position;
		}
		
		public String getPosition() {
			return position;
			
		}
}











