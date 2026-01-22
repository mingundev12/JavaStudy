package exam23;

public class GenericEx {

	public static void main(String[] args) {

		Box<String> stringBox = new Box<>();
		stringBox.set("Hello Java");
		String str = stringBox.get();
		System.out.println("str : " + str);
		
		Box<Integer> intBox = new Box<>();
		intBox.set(123);
		int value = intBox.get();
		System.out.println("value : " + value);
		
//		stringBox.set(123);
	}

}


/*

>>> 자주 사용하는 제너릭 기호 (관례)
이 기호들은 규칙은 아니지만 전 세계 개발자들의 '약속'

<T> : Type (일반적인 타입)
<E> : Element (리스트 같은 컬렉션의 요소)
<K> : Key (맵의 키)
<V> : Value (맵의 값)

<?> : wild card (모든 자료형이 다 올 수 있다.)
	public void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	의미 : 어떤 타입이든 상관없이 다 받을 수 있음
	특징 : 타입에 의존하지 않는 단순 출력이나 갯수 확인같은 작업에 사용
	제약 : 타입을 알 수 없으므로 null 외에는 요소를 추가(add) 할 수 없음
	<?> <? extends T> <? super T>
*/