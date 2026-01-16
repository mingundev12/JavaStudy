package dto;

import able.CafeOrder;

public class Cafe {

	private String cafeName;
	private String[] menu;

	public Cafe(String cafeName, String[] menu) {
		this.cafeName = cafeName;
		this.menu = menu;
	}

	// 주문을 위해 메뉴 제공
	public void showMenu() {
		System.out.println("[ " + cafeName + " ] 메뉴판");
		for (String m : menu) {
			System.out.println("_ " + m);
		}
	}

	// 주문하기
	public void order(String menuName) {
		// 원래는 여기 위치에 주문한 메뉴가 제공 가능한지 판단하는 if 문 있어야 함
		// 메뉴가 존재하는지 / 품절인지 여부를 체크하는 내용

//		CafeOrder order = OrderFactory.create(cafeName, menuName);
		CafeOrder order = null;
		// OrderFactory 클래스는 주문을 받았을 때 어떤 주문인지 (커피, 차, 디저트)

		switch (menuName) {
			case "아메리카노":
			case "라떼":
				order = new CoffeeOrder(cafeName, menuName);
				break;
			case "녹차":
			case "얼그레이":
				order = new TeaOrder(cafeName, menuName);
				break;
			case "치즈케이크":
			case "티라미수":
				order = new DessertOrder(cafeName, menuName);
				break;
			default:
				System.out.println("제공되지 않는 메뉴입니다.");
		}
		if (order == null) {
			return;
		}
		order.takeOrder();
		order.make();
		order.serve();
	}
}
