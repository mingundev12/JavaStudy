package exam01;

import java.util.Scanner;

//	클래스명에 언더바(_) 가 앞에오면 이름순 정렬에서 가장 앞으로 오게 된다
//	main 메서드가 있는 [실행 클래스] 를 만들 때 글자앞에 언더바를 넣으면 가장 앞에 오게되어 편리하게 실행 클래스를 보는 것이 가능하다
public class _Exec {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 클래스의 scanner 객체를, 매개변수 System.in 을 이용하는 Scanner 생성자로 생성

		String strs = "";
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("주민번호 : ");
		String ssn = scanner.nextLine();
		System.out.print("나이 : ");
		String age = scanner.nextLine();
		
		strs = strs + "/" + name + "," + ssn + "," + age;
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		System.out.print("주민번호 : ");
		ssn = scanner.nextLine();
		System.out.print("나이 : ");
		age = scanner.nextLine();
		
		strs = strs + "/" + name + "," + ssn + "," + age;
		
		System.out.println(strs);
		strs.substring(1);
		System.out.println(strs);
		
		String[] array = strs.split("/");
		
		String temp = array[0];
		String[] array2 = temp.split(",");
		
//		scanner.close();
//		C 언어에서는 열고 닫고를 개발자가 다 해줬어야 하는데
//		java 에서는 가비지 컬렉터가 알아서 처리를 해준다.
	}

}



/*
	* 입력 : 이름, 주민번호, 나이
	* 출력 : 이름  주빈번호  나이
	* 입력 -> 처리 -> 출력


*/