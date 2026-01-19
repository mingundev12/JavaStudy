package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {

//		입력 : 이름, 주민번호
//		출력 : 이름, 주민번호, 나이, 성별
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scanner.nextLine();
		System.out.print("주민번호 입력 : ");
		String ssn = scanner.nextLine();
		String gender = (Integer.parseInt(ssn.substring(7, 8)) % 2 == 0) ? "여자" : "남자";
		
		int birthYear = Integer.parseInt(ssn.substring(0, 2)) + 
				(((Integer.parseInt(ssn.substring(7, 8)) - 1) / 2) * 100) + 1900;
		int year = LocalDate.now().getYear();
		
		int age = year - birthYear + 1;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("주민번호 : %s\n", ssn);
		System.out.printf("나이 : %s\n", age);
		System.out.printf("성별 : %s\n", gender);
		
//		System.out.println("이름 : " + name + ",주민번호 : " + ssn + ",나이 : " + age + ",성별 : " + gender);
	}

}
