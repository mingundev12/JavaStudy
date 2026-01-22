package exam20;

public class _Exec {
	
	public static void main(String[] args) {
//		인터페이스는 일반적으로 객체생성을 못하지만 생성자를 사용하면서 재정의를 하면 가능은 하다
//		
//		주로 인터페이스나 추상 클래스를 즉석으로 구현할 때 사용
//		딱 한번 쓰고 버릴 객체에 최적화
		RemoteControl tv = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("tv를 켭니다");
			}
		};
		
		tv.turnOn();
	}
	
}


// 인터페이스는 주로 변수로 사용
// 그 변수 안에는 자식의 객체를 넣는다
// 예) List<> list = new ArrayList<>();
// 이때 List = 인터페이스, ArrayList = 자식클래스의 객체