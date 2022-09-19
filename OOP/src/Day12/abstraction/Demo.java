package Day12.abstraction;

public class Demo {
	public static void main(String[] args) {
		//DatabaseUtil db = new DatabaseUtil; cant make obj because of abstract method
		
		ProductService service = new ProductService();
		service.connectDatabase();
		service.delete(101);
		service.findById(222);
		service.insert();
		service.update();
		
		System.out.println("---------------------");
		DatabaseUtil db = new ProductService();
		db.update();
		db.connectDatabase();
		db.delete(102);
		db.findById(102);
		db.insert();
	}
}
