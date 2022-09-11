package day10;

public class Test {
	int numberOfemp = 3;
	int salary;
	String name;
	static int countId = 1;
	final int empId;
	
	public Test() throws AppException {
		if(countId > numberOfemp)
			throw new AppException ("Sorry, Limit has been reached!");
		empId = countId;
		countId++;
	}
	public void initData(String empName, int salary) {
		this.name = empName;
		this.salary = salary;
	}
	
	
	public void display() {

		System.out.println(empId + " \t" + name + "\t\t" + salary);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Id \t Name\t\t Salary");
			System.out.println();
			Test obj1 = new Test();
			obj1.initData("Toyoda", 10000000);
			Test obj2 = new Test();
			obj2.initData("Yasu", 11000000);
			Test obj3 = new Test();
			obj3.initData("Sakumi", 9000000);
			
			obj1.display();
			obj2.display();
			obj3.display();
			Test obj4 = new Test();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
