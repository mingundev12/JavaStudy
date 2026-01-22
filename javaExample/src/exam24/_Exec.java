package exam24;

public class _Exec {

	public static void main(String[] args) {

		Entry<String, Integer> score = new Entry<>("홍길동", 95);
		
		score.display();
		
		System.out.println("--------------------------");
		
		Entry<Integer, String> product = new Entry<>(1001, "노트북");
		product.display();
	}

}
