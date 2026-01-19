package exam03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Exec2 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(50);
		numbers.add(10);
		numbers.add(30);
		
		// 1. 오름차순 정렬(기본)
		Collections.sort(numbers);
		
		System.out.println("오름차순 : " + numbers);

		// 2. 내림차순 정렬
		Collections.sort(numbers, Collections.reverseOrder());
		
		System.out.println("내림차순 : " + numbers);
	}

}
