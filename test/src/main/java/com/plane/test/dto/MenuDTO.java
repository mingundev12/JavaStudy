package com.plane.test.dto;

public class MenuDTO {
	long id;
	String menuName;
	String menuImg;
	int price;
	String category;

	public MenuDTO() {
		// TODO Auto-generated constructor stub
	}

	public MenuDTO(long id, String menuName, String menuImg, int price, String category) {
		this.id = id;
		this.menuName = menuName;
		this.menuImg = menuImg;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		String str = "<tr><td>" + id + "</td>";
		str += "<td>" + menuName + "</td>";
		str += "<td><img src=\"" + menuImg +"\" alt=\"" + menuName + "\"></td>";
		str += "<td>" + price + "</td>";
		str += "<td>" + category + "</td></tr>";
		return str;
//		return "MenuDTO [id=" + id + ", menuName=" + menuName + ", menuImg=" + menuImg + ", price=" + price
//				+ ", category=" + category + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuImg() {
		return menuImg;
	}

	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
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
}
