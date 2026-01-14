package study20260114;

public class Item {
	private String itemName;
	private int itemPrice;
	private String itemMainImage;
	private int itemStock;

	public Item() {
		super();
	}

	public Item(String itemName, int itemPrice, String itemMainImage, int itemStock) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemMainImage = itemMainImage;
		this.itemStock = itemStock;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemMainImage=" + itemMainImage + ", itemStock="
				+ itemStock + "]";
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getitemPrice() {
		return itemPrice;
	}

	public void setitemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemMainImage() {
		return itemMainImage;
	}

	public void setItemMainImage(String itemMainImage) {
		this.itemMainImage = itemMainImage;
	}

	public int getItemStock() {
		return itemStock;
	}

	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}

}
