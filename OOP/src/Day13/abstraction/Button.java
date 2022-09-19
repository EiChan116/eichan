package Day13.abstraction;

public class Button implements OnclickListener { //inheritance from OncliclListener
	//And it is default assess modifier in class type by automatically
	private String name;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Font size: " + FONT_SIZE);
		System.out.println("Font family: " + FONT_FAMILY);
	}
	
	@Override
	public void onClick() { //onClick visibility is public, that's why need to change something in class.
		System.out.println(name + " click event...");
		
	}
	
	@Override
	public void onClickDouble() {
		System.out.println(name + " double click event...");
		
	}
}
