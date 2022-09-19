package Day13.abstraction;

public class DemoPolymonphism {
	public static void main(String[] args) {
		Flying[] data = new Flying[4];//it is not create object, it's taking the place
		//[0][1][2] -> fly object(human or airplane or birds
		Human obj1 = new Human();
		data[0] = obj1;
		data[1] = new Bird();//wrote together 
		data[2] = new Airplane();
		
		
		for(int i = 0; i < data.length - 1; i ++) {
			data[i].flies();
		}
	}
}
