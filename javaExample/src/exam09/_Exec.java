package exam09;

import java.util.HashMap;
import java.util.Map;

public class _Exec {

	public static void main(String[] args) {
		
//		List<> list = new ArrayList<>();

//		HashMap(맵) - key, value
		HashMap<String, String> map = new HashMap<>();
		
		System.out.println("map : " + map);
		map.put("name","홍길동");
		System.out.println("map : " + map);
		map.put("kor", 90 + "");
		System.out.println("map : " + map);
		map.put("eng", 80 + "");
		System.out.println("map : " + map);
		map.put("name","이성순");
		System.out.println("map : " + map);
//		없는 키 -> 추가 // 있는 키 -> 수정

//		System.out.println("---> " + map.get("name"));
//		System.out.println("---> " + map.get("kor"));

		System.out.println("---> " + map.keySet());
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
//		map.remove("kor");
//		System.out.println("map : " + map);
		
		Map<Integer, Object> map2 = new HashMap<>();
		
		map2.put(1, "홍길동");
		System.out.println("map2 : " + map2);
		map2.put(2, "이성순");
		System.out.println("map2 : " + map2);
		
		for (int key : map2.keySet()) {
			System.out.println(key + " : " + map2.get(key));
		}
	}

}
