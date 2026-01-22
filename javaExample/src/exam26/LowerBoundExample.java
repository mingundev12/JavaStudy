package exam26;

import java.util.List;

public class LowerBoundExample {
//	Integer 를 담을 수 있는 리스트(Integer, Number, Object) 에 숫자 추가
	public static void addIntegers(List<? super Integer> list) {
		for (int i = 1; i <= 3; i++) {
			list.add(i);
		}
	}
}
