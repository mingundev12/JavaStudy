package study20260105;

import java.util.Scanner;

public class LoopMain {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("i : " + i);
//		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 0)
//				System.out.println("i : " + i);
//		}


//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			System.out.println( i );
//		}

//		1부터 12까지 출력하는데
//		4의 배수에는 four 라고 출력하시오
//
//		for (int i = 1; i <= 12; i++) {
//			if (i % 4 == 0)
//				System.out.println("four");
//			else
//				System.out.println(i);
//		}

//		
//		int count = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 17 == 0)
//				count ++;
//		}
//		
//		System.out.println(" 17의 배수 : " + count + "개");

//		문제
//		동전 앞면 뒷면 맞추기 게임
//		게임을 총 10판 진행하기
//		게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기

//		int count = 0;
//		int coinCom, coinUser;
//		
//		System.out.println("동전 앞면뒷면 맞추기 게임");
//		for (int i = 0; i < 10; i++) {
//			coinCom = (int) (Math.random() * 2) + 1; // 매 회차마다 동전 앞뒤를 재설정
//			System.out.print(" 앞면뒷면 입력(앞 - 1, 뒤 - 2) : ");
//			coinUser = scan.nextInt();
//			
////			 사용자가 입력한 동전 앞뒤와 컴퓨터에 저장된 앞뒤면을 비교하여
////			일치하면 => 맞추셨습니다 문구 출력과 함께 count 증가
////			불일치하면 => 틀리셨습니다 문구 출력
//			if (coinUser == coinCom) {
//				System.out.println("맞추셨습니다!");
//				count++;
//			}
//			else
//				System.out.println("틀리셨습니다..");
//		}
//		System.out.println(" 맞춘횟수 : " + count);

//		무한 루프 - 	반복문은 조건식이 참인 경우에 계속 반복을 한다.
//					무조건 참이 되게 조건식을 설정하면 무한 반복을 할 수 있다.
//		무한 루프는 지정된 횟수가 없기에 멈추지 않고 계속 동작한다.
//		그래서 무한루프 구현시 특정 조건을 걸어 둔다.

//		for( ; true ; ) {
//			
//		}

//		for(;;) {
//			;
//		}

//		int i = 10;
//		while (true) {
//			System.out.println(i);
//			i++;
//			if (i == 40)
//				break;
//		}

//		while (true) {
//			int num = (int) Math.floor(Math.random() * 20) + 1;
//			System.out.println(num);
//			if (num == 11)
//				break;
//		}
		
		int com = (int) Math.floor(Math.random() * 50) + 1;
		
		while(true) {
			System.out.print("1~50중 입력 : ");
			int user = scan.nextInt();
			
			if( user > com ) {
				System.out.println("DOWN");
			}
			if( user < com ) {
				System.out.println("UP");
			}
			if( user == com ) {
				System.out.println("정답입니다.");
				break;
			}
		}
	}

}

/*
 * 
 *
 * 반복문 - for, while, do while 반복문이란 특정 코드를 정해진 횟수/조건 만큼 동작시키는 과정 이다.
 * 
 * 
 * for문
 * 
 * for ( 초기값 ; 조건식 ; 증감식 ) { 반복 실행할 내용; 반복 실행할 내용; }
 * 
 */