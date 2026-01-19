package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
//		<자료형 타입> : Generic, 제너릭 - 자료형을 정하는 것
//		리스트는 기본적으로(제너릭이 없으면) Object (모든 자료형의 최상위 형태) 로 지정되지만
//		그 경우 리스트에 자료형 제한없이 들어간 데이터를 처리하기가 어려워지므로
//		리스트에 들어갈 자료형을 지정해 주는 것이 데이터를 처리하는 데 용이해진다.

		System.out.println("List : " + list);
		
		list.add(1);
		System.out.println("List : " + list);
		
		list.add(2);
		System.out.println("List : " + list);
		
		list.add(300);
		System.out.println("List : " + list);
		
//		list.add("hong");
//		System.out.println("List : " + list);
		
		System.out.println("리스트의 길이 : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
		}

		System.out.println("----------------");
		
		list.remove(2);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
		}


		System.out.println("----------------");
		
		list.set(0, 100);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
		}
		
		// 공통모듈
		System.out.println("----------------");
		
		int i = 0;
		for(Integer a : list) {
			System.out.println("리스트의 " + (i++) + "번째 인덱스의 값 : " + a);
		}
	}

}
