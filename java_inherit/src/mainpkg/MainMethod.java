package mainpkg;

import dto.Cafe;

//import able.Actionable;
//import dto.Member;

public class MainMethod {

	public static void main(String[] args) {
//		Actionable member = new Member("skyblue", "이순신", 34);
//		
//		member.move();
//		member.drink();
//		System.out.println(member);
//		자식 클래스의 다른 메서드는 사용하지 못하지만,
//		toString 은 오버라이드 된 메서드이기 때문에 사용이 가능하다.
		
		String[] menu = {"아메리카노", "라떼", "녹차", "얼그레이", "치즈케이크", "티라미수"};
		Cafe cafe = new Cafe("한라봉카페", menu);
		
		cafe.showMenu();
		System.out.println("========= \n\n");
		
		cafe.order("녹차");
		System.out.println("========= \n\n");
		
		cafe.order("치즈케이크");
		System.out.println("========= \n\n");
		
		cafe.order("사이다");
		System.out.println("========= \n\n");
		
		
//		for(String m : menu) {
//			cafe.order(m);
//		}
	}

}
