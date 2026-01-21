package exam15;

public class Product {
	private String name;
	private int cost;
	private int count;
	
	public Product(String name, int cost, int count) {
		this.name = name;
		this.cost = cost;
		this.count = count;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s", name, cost, count, count * cost);
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
