package study20260112;

public class Product {

	private String name;
	private int price;
	private String category;
	private int amount;
	
	
	public Product(String name, int price, String category, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.amount = amount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", amount=" + amount + "]";
	}
	
	
=======
	private String name;
	private int price;
	private String category;
	private int amount;
	
	
	public Product(String name, int price, String category, int amount) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.amount = amount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + ", amount=" + amount + "]";
	}
>>>>>>> branch 'main' of https://github.com/mingundev12/JavaStudy
}
