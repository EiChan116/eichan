package day10;

public class Employee {
	static int noOfEmp = 3;//static fields/variable
	static int nextId = 1; //static fields/variable
	final int empId;//final variable
	String empName;//instant variable
	int salary;//instant variable
	//constructor
//	{
//		if(nextId > noOfEmp) {
//			empId = nextId;
//			nextId++;
//		}
//		
//	}
	public Employee() throws AppException {
		if(nextId > noOfEmp) 
			throw new AppException("Sorry! Limited number had been reached!");
		empId = nextId;
		nextId++;
	}
	public void initData(String name, int salary) {
		this.empName = name;
		this.salary = salary;
	}
	public void changeData(String newName, int newSalary) {
		if(! newName.equals(this.empName))
			this.empName = newName;
		if( newSalary > this.salary)
			this.salary = newSalary;
	}
	public void showData() {
		System.out.println(this.empId + " \t " + this.empName + " \t " + this.salary);
	}
	@Override
	public String toString() {
		return "Employee empId: " + empId + ", empName: " + empName + ", salary: " + salary + ".";
	}
	//main
	public static void main(String[] args) {
		try {
			Employee emp1 = new Employee();
			emp1.initData("Toyoda", 10000000);
			Employee emp2 = new Employee();
			emp2.initData("Sakumi", 7000000);
			Employee emp3 = new Employee();
			emp3.initData("Yasuhiro", 10010000);
			
			
			
			System.out.println("Id\t Name\t\t Salary");
			System.out.println();
			emp1.showData();
			emp2.showData();
			emp3.showData();
			
			emp1.changeData("Toyodayasuhiro", 11000000);
			System.out.println("After changig: " + emp1);
			
			Employee emp4 = new Employee();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
