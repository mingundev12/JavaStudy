package study20260107;

import java.util.Arrays;
import java.util.Scanner;

public class SeatReservation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		영화관 좌석은 이며, 배열로 관리한다.  
//		0 : 빈 좌석
//		1 : 예약된 좌석
//		사용자로부터  예약인원 수 를 입력받아
//		원하는 위치(인덱스) 탐색하여 연속된 빈 좌석이 있으면 예약 처리하시오.
//
//		규칙
//		연속된 빈 좌석이 있으면 1로 변경
//		예약이 완료되면 예약된 좌석 번호 출력
//
//		연속 좌석이 없으면
//		"연속 좌석이 없습니다" 출력
//		1차원 배열만 사용
//
//		앞자리 우선 예약
//		예시
//		예약 인원 수 : 3
//		3석 예약 완료 (1번 ~ 3번)
//		예약 인원 수 : 5
//		연속 좌석이 없습니다

		int[] seats = new int[50];
		int res_all = 0;

//		Arrays.fill(seats, 0);

		while (true) {
			System.out.print("예약 인원 수 : ");
			int res_num = sc.nextInt();

//			예약 신청 인원 수 : res_num
//			예약된 인원 수(마지막 예약자 좌석번호) : res_all + 1 (seats 배열의 0번 인덱스 = 1번 좌석)
//			전체 좌석 수 : seats.length
//			남은 자리 수 : seats.length - (res_all + 1)
//			남은 자리수보다 예약 인원수가 작아야 예약이 가능하다
			if (res_all + res_num < seats.length) {
				for (int i = 0; i < res_num; i++) {
					seats[i + res_all] = 1;
				}
				System.out.println(res_num + "석 예약 완료 (" + (res_all + 1) + "번 ~ " + (res_all + res_num) + "번)");
				res_all = res_all + res_num;
			} else {
				System.out.println("연속 좌석이 없습니다.");
				break;
			}
		}

	}

}
