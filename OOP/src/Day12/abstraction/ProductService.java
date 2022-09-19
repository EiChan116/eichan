package Day12.abstraction;

public class ProductService extends DatabaseUtil{
	
	@Override
	public void insert() {
		System.out.println("Insert into Product");
	}
	
	@Override
	public void update() {
		System.out.println("Update Product set name = ''");
	}
	
	@Override
	public boolean delete(int productId) {
		System.out.println("Delete from Product");
		return false;
	}
	
	@Override
	public Product findById(int pId) {
		System.out.println("Select * from Product where productID = id");
		return null;
	}
}
	
