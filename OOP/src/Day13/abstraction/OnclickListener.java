package Day13.abstraction;

public interface OnclickListener { //it can't create object because of interface type.
	int FONT_SIZE = 12;
	public static String FONT_FAMILY = "Arial";
	
	//abstract method
	void onClick(); // public abstract onClick();
	void onClickDouble(); // public abstract onClickDouble();
}
