package exam27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedExampleEx {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
		List<Integer> intList = Arrays.asList(1, 2, 3);
		
//		Arrays.asList() 로 리스트를 만들면 크기변경이 안된다
//		추가 불가, 삭제 불가, 수정 가능
//		strList.add("aaa"); // 예외 발생
//		strList.remove(0); // 예외 발생
//		strList.set(1, "Orange"); // 코드 정상적으로 동작
		
//		new ArrayList<>(Arrays.asList()) 로 감싸서 만들면 
//		추가, 삭제가 가능해진다
//		strList.add("aaa"); // 코드 정상적으로 동작
//		strList.remove(0); // 코드 정상적으로 동작
//		strList.set(1, "Orange"); // 코드 정상적으로 동작
		
		System.out.print("문자열 리스트 : ");
		UnboundedExample.printAll(strList);
		
		System.out.print("숫자 리스트 : ");
		UnboundedExample.printAll(intList);
	}
}
