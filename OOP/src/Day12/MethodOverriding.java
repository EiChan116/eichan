package Day12;

public class MethodOverriding {
	public static void main(String args[]) {
		Developer d = new Developer();
		d.work();
		d = new FrontendDeveloper();
		d.work();
		d = new BackendDeveloper();
		d.work();
	}
	
}

class Developer {
	public void work() {
		System.out.println("Doing some work!");
	}
}

class FrontendDeveloper extends Developer{
	
	@Override
	public void work() {
		System.out.println("Frontend developing!");
	}
}

class BackendDeveloper extends Developer {
	
	@Override
	public void work() {
		System.out.println("Backend Deloveloper!");
	}
}