package Day13.abstraction;

public class Human implements Flying {

	@Override
	public void flies() {
		System.out.println("Human fly with parachute...");
	}
}
