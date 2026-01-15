package sangsog;

import products.*;

public class MainMethod {

	public static void main(String[] args) {

		Television tv = new Television();
		
		tv.power();
		tv.power();
		
		Refrigerator rfg = new Refrigerator();
		
		Aircon air = new Aircon("LG휘센", 310);
		
	}

}

/*	
 * 추상클래스, 추상메서드
 * 
 * 추상클래스 만드는 이유
 * 	상속단계에서 공통적인 부분을 부모클래스에 두는데
 * 		자식클래스마다 특징적인 동작을 위해
 * 		추상메서드가 만들어 두어야 한다
 * 	자식클래스들에게 규칙을 강제화 하기 위해
 * 
 */

//	자바의 상속
//	오버라이딩
//	다형성
//	추상화
