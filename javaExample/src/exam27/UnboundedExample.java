package exam27;

import java.util.List;

public class UnboundedExample {
//	어떤 타입의 리스트가 오든 전체 내용을 출력
	public static void printAll(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
