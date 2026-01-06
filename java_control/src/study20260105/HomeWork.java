package study20260105;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
//		1월 5일 과제
//		 * 
//		 * 가위 바위 보 게임을 총 15판 진행
//		 * 게임을 진행하면서 1판 끝낼때 마다
//		 * 몇승 몇패 몇무 출력하기
		
		int cntWin = 0, cntLose = 0, cntDraw = 0;
		Scanner sc = new Scanner(System.in);
		
		int com, user, res;

		System.out.println("가위바위보 게임!");
		System.out.println("가위 - 1, 바위 - 2, 보 - 3");
		for(int i = 0; i < 15; i++) {
			com = (int) (Math.random() * 3) + 1;
			System.out.print("입력 : ");
			user = sc.nextInt();
			
			res = (user - com + 3) % 3;
//			System.out.print(res);
			
			if( res == 0 ) {
				System.out.println("비김");
				cntDraw++;
			} else if (res == 1) {
				System.out.println("이김");
				cntWin++;
			} else {
				System.out.println("짐");
				cntLose++;
			}
		}
		
		System.out.println("최종 결과 : 15전 " + cntWin + "승 " + cntLose + "패 " + cntDraw + "무 ");
		sc.close();
	}

}

