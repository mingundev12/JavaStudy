package exam04;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동", 80));
		list.add(new Student("이성순", 90));
		list.add(new Student("장천용", 100));
		
//		람다를 이용한 정렬 (점수 내림차순)
		list.sort((s1, s2) -> s2.score - s1.score);
		
		System.out.println("성적순 정렬 결과 : ");
		System.out.println(list);
		
//		하나의 변수에 데이터를 여러 개 담는 방법 :
//		배열, 리스트, 객체
	}

}
