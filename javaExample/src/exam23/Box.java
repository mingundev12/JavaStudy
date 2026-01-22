package exam23;

public class Box<T> {

	private T item;
	
	public void set (T item) {
		this.item = item;
	}
	
	public T get() {
		return item;
	}
}

// 왜 제너릭을 사용할까?
//1. 타입 안정성 (type safety)
//제너릭을 쓰면 엉뚱한 데이터가 들어오는 것을
//컴파일 단계에서 미리 막을 수 있음 (빨간 줄이 미리 뜬다)
//
//2. 번거로운 형변환 (casting) 생략
//과거에는 데이터를 꺼낼 때마다 (String) 처럼 형변환을 해야 했지만,
//제너릭을 쓰면 자바가 알아서 처리해 줌