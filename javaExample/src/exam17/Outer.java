package exam17;

public class Outer {
	private int value = 10;
	
	class Inner {
		void display() {
			System.out.println("외부 변수 값 : " + value);
		}
	}

}
