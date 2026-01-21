package exam15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
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
			list.add(new Product(name, cost, count));
		}
		
		int total = 0;
		for (Product p : list) {
			System.out.println(p);
			total += p.getCost() * p.getCount();
		}
		System.out.println("합계 : " + total);
	}

}
