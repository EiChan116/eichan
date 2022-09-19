package Day12;

import java.util.Arrays;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println("100 + 200 = " + Addition.add(100, 200));
		System.out.println("2.4 + 5.6 = " + Addition.add(2.4, 5.6));
		
		System.out.println("Toyoda " + "Yasuhiro = " + Addition.add("Toyoda", "Yasuhiro"));
		System.out.println("5.5 + 9.9 = " + Addition.add(0.4f, 9.0f));
		System.out.println("array's sun = " + Addition.add(new int[] {100, 200, 500, 100}));
	}
}
class Addition {
	static int add(int a, int b) {
		return a + b;
	}	
	static int add(int[] input) {
		return Arrays.stream(input).sum();
	}
	static double add(double a, double b) {
		return a + b;
	}
	static float add(float a, float b) {
		return a + b;
	}
	static String add(String a, String b) {
		return a + b;
	}
}
