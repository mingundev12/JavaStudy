package exam07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {

//		실행 메서드의 소스 길이를 최대한 줄여야 에러의 생성이 최소화된다
//		그러므로 데이터 클래스의 양이 많아질 수 밖에 없다.
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();

		while (true) {
			System.out.print("이름(종료 = q):");
			String name = sc.nextLine();

//			if (name.toLowerCase().equals("q")) {
			if (name.toUpperCase().equals("Q")) {
				break;
			}

			System.out.print("국어:");
			String kor_ = sc.nextLine();
			System.out.print("영어:");
			String eng_ = sc.nextLine();
			System.out.print("수학:");
			String mat_ = sc.nextLine();
			int kor = Integer.parseInt(kor_);
			int eng = Integer.parseInt(eng_);
			int mat = Integer.parseInt(mat_);
			
			Student student = new Student(name, kor, eng, mat);

			list.add(student);

		}

		for (int i = 0; i < list.size(); i++) {
			list.get(i).display();
		}
	}

}
