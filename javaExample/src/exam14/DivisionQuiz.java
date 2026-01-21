package exam14;

import java.util.Scanner;

public class DivisionQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		1. 첫 번째 숫자 입력
		System.out.print("첫 번째 정수 : ");
		String num1_ = sc.nextLine();
//		String temp = num1_;
//		
//		for (int i = 0; i < 10; i++) {
//			temp = temp.replace(i + "", "");
//		}
//		for (int i = 0; i < temp.length(); i++) {
//			num1_ = num1_.replace(temp.charAt(i) + "", "");
//		}
//		int num1 = 0;
//		if (!num1_.equals("")) {
//			num1 = Integer.parseInt(num1_);
//			System.out.println(num1);
//		} else {
//			System.out.println("숫자를 입력해주세요");
//		}
		
		int num1;
		try {
			num1 = Integer.parseInt(num1_);
			
		} catch (Exception e) {
			num1 = -1;
		}
		
		System.out.println("num1 : " + num1);
		

//		System.out.print("두 번째 정수 : ");
//		String num2_ = sc.nextLine();
//		temp = num2_;
//		
//		for (int i = 0; i < 10; i++) {
//			temp = temp.replace(i + "", "");
//		}
//		for (int i = 0; i < temp.length(); i++) {
//			num2_ = num2_.replace(temp.charAt(i) + "", "");
//		}
//		int num2 = 0;
//		if (!num2_.equals("")) {
//			num2 = Integer.parseInt(num2_);
//			System.out.println(num2);
//		} else {
//			System.out.println("숫자를 입력해주세요");
//		}
		
		
		/*
//		2. 두 번째 숫자 입력
		System.out.print("두 번째 정수 : ");
		String num2_ = sc.nextLine();
		int num2 = Integer.parseInt(num2_);
		
		int result = num1 / num2;
		System.out.println("결과 : " + num1 + " / " + num2 + " = " + result);
		
		*/
	}

}
