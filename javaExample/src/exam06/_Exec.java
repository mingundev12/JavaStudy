package exam06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		
//		이름, 국어, 영어, 수학
//		이름 국어 영어 수학 총점 평균
		
		Scanner sc = new Scanner(System.in);
//		List<Student> students = new ArrayList<>();
		List<String[]> list = new ArrayList<>();
		
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
			
//			students.add(new Student(name,
//					Integer.parseInt(kor_),
//					Integer.parseInt(eng_),
//					Integer.parseInt(mat_)
//					));
			int kor = Integer.parseInt(kor_);
			int eng = Integer.parseInt(eng_);
			int mat = Integer.parseInt(mat_);
			int tot = kor + eng + mat;
			double avg = tot / 3.0;
			
			String[] strs = new String[6];
			strs[0] = name;
			strs[1] = kor + "";
			strs[2] = eng + "";
			strs[3] = String.valueOf(mat);
			strs[4] = tot + "";
			strs[5] = avg + "";
			
			list.add(strs);
			
		}
		
//		System.out.println("list : " + list);
		
		for(String[] strs : list) {
			for(String str : strs) {
				System.out.printf("%s\t", str);
			}
			System.out.println();
		}
		

//		for (Student s : students) {
//			System.out.println(s);
//		}
	}

}
