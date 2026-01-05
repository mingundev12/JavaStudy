package study20260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

		int num = 10;

		if (num > 5) {
			System.out.println(" 5보다 크다 ");
		} else {
			System.out.println(" 5보다 작다 ");
		}

//		바이킹 탑승 가능 : 145cm 이상

		int tall = 160;

//		조건식을 만들때, 비교대상 + 연산자 + 기준값 으로 하는 것이 좋다.
//		조건식의 참일 때 긍적적인 결과가 나올 수 있도록 조건식을 만드는 것이 좋다.
//		else 문 안의 코드가 if 보다 짧게 나올 수 있도록 조건문과 코드를 만드는 것이 좋다.
		if (tall >= 145) {
			System.out.println(" 바이킹 탑승 가능");
		} else {
			System.out.println(" 바이킹 탑승 불가");
		}

		int age = 33;

		if ((age / 10) == 3) { // age >= 30 && age < 40
			System.out.println("30대 이다");
		} else {
			System.out.println("20대 이다");
		}
		
//		주차장에 요금이 기본요금은 1000원이다.
//		기본시간은 30분이다.
//		10분 당 100원씩 추가 예) 39분은 1000원, 40분은 1100원
//		단 4시간 이상 주차시 기본요금은 2500원이다.
//		예) 3시간 50분 (230분) -> 3000원
//			4시간 12분 (252분) -> 2600원
//		주차한 기간(분)을 입력하면 요금이 계산하여 출력되는 코드를 작성


		// 과제 풀이
		
		// 기본요금(1000원), 4시간 이상 기본요금(2500원), 10분당 추가요금(100원)을 상수로 선언
		// 상수로 선언한 이유 : 주차장 사정에 따라 요금이 인상되거나 인하될 경우 계산식에서의 반영이 용이함
		final int BASE_RATE = 1000, BASE_TIME = 30;
		final int BASE_RATE_OVERTIME = 2500, BASE_OVERTIME = 240;
		final int INC_RATE = 100, INC_TIME = 10;
		
		// 주차한 시간(분)과 주차요금(원)을 변수로 선언하고 키보드 입력 받을 Scanner 객체 선언
		int parkingTime = 0;
		int parkingRate = 0;
		Scanner sc = new Scanner(System.in);

		// 시스템 메세지로 질문을 출력하여 주차한 시간을 입력받음
		System.out.print("주차한 기간(분) 입력 : ");
		parkingTime = Integer.parseInt(sc.nextLine());

		// 주차시간이 양수(0이상)일때만 주차요금 계산
		// 조건문 - 240분 이상일 경우의 요금 계산 : 240분 이후의 기본요금 + 240분에서 초과한 시간(분)을 10으로 나눈뒤 추가요금(10분당 100원)을 곱하여 계산
		// 40분 이상일 경우의 요금 계산 : 기본요금 + 40분에서 초과한 시간(분)을 10으로 나눈 뒤 추가요금(10분당 100원)을 곱하여 계산  
		// 0분 초과일 경우 요금 계산 : 기본요금
		// 0분 일 경우(주차하지 않음)는 요금을 계산하지 않음(초기화된 0원 그대로)
		if (parkingTime >= 0) {
			if (parkingTime >= BASE_OVERTIME)
				parkingRate = BASE_RATE_OVERTIME + (((parkingTime - BASE_OVERTIME) / INC_TIME) * INC_RATE);
			else if (parkingTime > BASE_TIME)
				parkingRate = BASE_RATE + (((parkingTime - BASE_TIME) / INC_TIME) * INC_RATE);
			else
				parkingRate = BASE_RATE;
			System.out.println("주차요금 : " + parkingRate + " 원");
		}
		// 주차시간이 음수로 입력된 경우는 잘못 입력하였다는 메세지를 출력.
		else
			System.out.println("주차시간 입력이 잘못되었습니다.");

		// 선언했던 Scanner 객체를 닫음
		sc.close();
		
/*		
 * 		int cost = 1000; // 기본요금 (30분)
 * 		int inc = 100, incTime = 10; // 10분당 100원
 * 		int time = 30; // 기본시간 30분
 * 
 *  	// 주차 시간 총 몇 분 입력
 *  	Scanner scan = new Scanner(System.in); // 시스템(컴퓨터)으로부터 입력된 키 값 받기
 *  	
 *  	System.out.print(" 총 몇분 주차 : ");
 *  	int pTime = scan.nextInt(); // 키보드 입력 값 받아서 정수로 변환하여 변수에 저장
 *  
 *  	//기본값이 큰 것 부터 하는 것이 좋다
 *  	pTime /= incTime;
 *  	if (pTime >= 24) { // 4시간 이상 주차했다면
 *  		cost = 2500;
 *  		pTime -= 24;
 *  	} else if(pTime > 3) { // 4시간 이상이 아니라면, 기본시간 30분으로 계산해야 된다.
 *  		pTime -= 3; // 기본시간이 30분이니까 3빼기
 *  	} else {
 *  		pTime = 0;
 *  	}
 *  
 *  	int price = cost + pTime * inc;
 *		System.out.println("주차요금 : " + price + " 원");
 */
	}

}

/*
 * 제어문
 *
 * 조건문 - if (+ else), switch
 *
 * if = 참과 거짓 / 가장 많이 사용되는 조건문 / 반드시 조건이 필요하다. 코드로 조건식을 잘 만드는 것이 중요 ㄴ 간단한 조건식 :
 * 기준값이 있음 (예: 놀이기구 탑승 제한 키(신장)) ㄴ 조건식은 if 뒤에만 올 수 있으며, else 뒤에는 조건식을 넣을 수 없다.
 *
 * 1. 조건에 따른 결과가 하나일 경우 if( 조건식 ) { 조건식이 참일 경우 실행할 코드; }
 *
 * 2. 조건에 따른 결과가 두개일 경우 **(자주사용) if( 조건식 ) { 조건식이 참일 경우 실행할 코드; } else { 조건식이
 * 거짓일 경우 실행할 코드; }
 *
 * 3. if( 조건식1 ) { 조건식1이 참일 경우 실행 } else { 조건식1이 거짓일 경우 실행 if ( 조건식2 ) { 조건식2가
 * 참일 경우 실행 } }
 *
 * 4. 속도 : 3보다 4의 경우 조금 더 빠르다 **(자주사용) if( 조건식1 ) { 조건식1이 참일 경우 실행 } else if(
 * 조건식2 ) { 조건식1이 거짓이면서 조건식2가 참일 경우 실행 }
 *
 * 조건식에는 논리 연산자와 비교 연산자만으로 구성된다. 논리 연산자 : && (AND) 곱셈 연산자 || (OR) 덧셈 연산자 ! (NOT)
 * 비교 연산자 : >, >=, <, <=, ==, !=
 * 
 * switch = 선택 <- 주로 메뉴에 사용 (사용자의 선택에 따라 동작) / 한 프로그램에서 가장 큰 틀을 차지하는 조건문
 *
 *
 * 반복문 - for, while, do while
 *

 */


