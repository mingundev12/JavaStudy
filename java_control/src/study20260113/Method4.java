package study20260113;

public class Method4 {
	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		ProductService ps = new ProductService(connect.selectData());
		
		for (Product product : ps.getProducts()) {
			System.out.println(product);
		}
	}
}
