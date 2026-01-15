package study20260113;

import java.util.ArrayList;

public class ProductService {
	private ArrayList<Product> products;
	
	public ProductService(ArrayList<Product> products) {
		setProducts(products);
	}

	private void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
	
}
