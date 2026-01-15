package study20260115;

import java.util.ArrayList;

import study20260114.Item;

public class Practice01 {

	public static void main(String[] args) {
		
		DBConnect dbCon = new DBConnect();
		
		ArrayList<Item> items = dbCon.selectItem();
		
		for (Item item : items)
			System.out.println(item);
		int length = items.size();
		items.get(0).getItemName();
	}

}
