package exam17;

// 인스턴스 내부 클래스
// 외부 클래스의 인스턴스가 생성되어야만 내부 클래스도 존재할 수 있음.
// - 특징 : 외부 클래스의 자원을 내 것처럼 사용
// - 생성 방법 : 외부객체.new 내부클래스();
public class _Exec {
	
	public static void main(String[] args) {
//		1. 외부객체 생성
		Outer outer = new Outer();
//		2. 외부객체를 통해 내부객체 생성
		Outer.Inner inner = outer.new Inner();
		
		inner.display();
		
	}

}
