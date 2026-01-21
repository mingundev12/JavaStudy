package exam15;

import java.util.*;
import java.util.Scanner;

public class ShoppingList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Map<String, Product> list = new HashMap<>();
		
		while (true) {
			System.out.print("품목명(q=종료) : ");
			String name = sc.nextLine();
			
			if (name.toLowerCase().equals("q")) break;
			
			int cost, count;
			try {
				System.out.print("가격 : ");
				cost = Integer.parseInt(sc.nextLine());
				
				System.out.print("수량 : ");
				count = Integer.parseInt(sc.nextLine());
				
			} catch (Exception e) {
				System.out.println("가격, 수량에 숫자를 입력해주세요");
				System.out.println("품목입력으로 돌아갑니다.");
				continue;
			}
			if(list.containsKey(name)) {
				System.out.println("같은 상품을 구매하였습니다.");
				System.out.println("수량과 가격을 갱신합니다");
				Product product = list.get(name);
				product.setCost(cost);
				product.setCount(count + product.getCount());
				list.put(name, product);
			} else {
				list.put(name, new Product(name, cost, count));
			}
		}
		
		int total = 0;
		for (String key : list.keySet()) {
			System.out.println(list.get(key));
			total += list.get(key).getCost() * list.get(key).getCount();
		}
		System.out.println("합계 : " + total);
	}

}
