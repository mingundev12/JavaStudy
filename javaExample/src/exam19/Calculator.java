package exam19;
// 지역 클래스 - "메서드 안에서만"
public class Calculator {
	
	void process(int a, int b) {
		class Operation {
			void add() {
				System.out.println("결과 : " + (a + b)) ;
			}
		}
		
		Operation op = new Operation();
		op.add();
	}

}
