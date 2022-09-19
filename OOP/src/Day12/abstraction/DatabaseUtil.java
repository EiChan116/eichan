package Day12.abstraction;

public abstract class DatabaseUtil {
	//fields
	private String db_name = "shopdb";
	
	public void connectDatabase() {
		System.out.println("Conntcting to" + db_name);
	}
	
	public abstract void insert();//abstract is without body
	public abstract void update();
	public abstract boolean delete(int id);
	public abstract Object findById(int id);
}
