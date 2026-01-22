package exam26;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundExampleEx {

	public static void main(String[] args) {
//		Integer의 부모인 Number 리스트 준비
		List<Number> numList = new ArrayList<>();
		LowerBoundExample.addIntegers(numList);
		System.out.println("추가된 데이터 : " + numList);

	}

}
