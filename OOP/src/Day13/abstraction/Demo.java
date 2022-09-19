package Day13.abstraction;

public class Demo {
	public static void main(String[] args) {
//		OnclickListener object = new OnclickListener();//it is interface type, can't create object.
		
		var btn1 = new Button("btn_login");//can reference obj via child class
		Button btn2 = new Button("btn_cancel");
		
		btn1.display();
		btn1.onClick();
		btn1.onClickDouble();
		
		System.out.println("..................");
		
		btn2.display();
		btn2.onClick();
		btn2.onClickDouble();
		
	}
}
