package exam11;

import java.util.HashSet;
import java.util.Set;

public class _Exec {

	public static void main(String[] args) {
//		Map - key, value (인덱스 없음)
//		List - index
//		Set - 중복을 허용하지 않는 (인덱스 없음)
		
		Set<String> set = new HashSet<>();
		
		System.out.println("set : " + set);
		set.add("사과");
		System.out.println("set : " + set);
		set.add("바나나");
		System.out.println("set : " + set);
		set.add("포도");
		System.out.println("set : " + set);
		set.add("사과");
		System.out.println("set : " + set);
		
		System.out.println("담긴 갯수 : " + set.size());
		
		if (set.contains("사과")) {
			System.out.println("사과가 있네.");
		}
		
		for (String s : set) {
			System.out.println(s);
		}
		

		set.remove("포도");
		System.out.println("set : " + set);

		
		if (set.contains("체리")) {
			set.remove("체리");
			set.add("cherry");
		}
		System.out.println("set : " + set);
		
	}

}
