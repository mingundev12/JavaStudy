package exam28;

public class Product {
	String name;
	int cost;
	int count;
	
	public Product() {}
	
	public Product(String name, int cost, int count) {
		this.name = name;
		this.cost = cost;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}
