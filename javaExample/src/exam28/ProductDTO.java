package exam28;

public class ProductDTO {
	private String productName;
	private int productPrice;
	private int buyCounter;
	private int total;

	public ProductDTO() {
	}

	public ProductDTO(String productName, int productPrice, int count) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.buyCounter = count;
		this.total = productPrice * count;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String name) {
		this.productName = name;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getBuyCounter() {
		return buyCounter;
	}

	public void setBuyCounter(int count) {
		this.buyCounter = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		total = productPrice * buyCounter;
	}

	@Override
	public String toString() {
		return productName + "\t" + productPrice + "\t" + buyCounter + "\t" + total;
	}

	public void display() {
		System.out.println(this);
	}
}
