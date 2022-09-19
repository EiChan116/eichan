package Day11.inheritance;

public class Student extends Person{

		private int rno;//way 1) set via constructor, 2) use setter method 0r 3)custom method
		
		public Student(int rno, String name, String phone) {
			super(name, phone);//no default constructor in parent that's why call by super
			this.rno = rno;
		}
		
		//method
		public int getRno() {//to get(output)
			return rno;
		}
		
		@Override
		public void display() {
			System.out.println("Rno: " + rno);
		}
}
