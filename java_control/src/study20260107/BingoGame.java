package study20260107;

//import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		1차원 배열 25의 크기
//		배열에 무작위 숫자 저장하기 (1~100)
		
		int[] bingo = new int[25];
		
//		boolean hasValue;
//		for (int i = 0; i < bingo.length; i++) {
//			hasValue = true;
//			do {
//				bingo[i] = (int) Math.floor(Math.random() * 100) + 1;
//				for (int k = 0; k < i; k++) {
//					hasValue = bingo[k] == bingo[i];
//					if (hasValue) break;
//				}
//			} while (hasValue && i!=0);
//		}
		
		for (int i = 0; i < bingo.length; i++) {
			bingo[i] = (int) Math.floor(Math.random() * 100) + 1;
			for (int k = 0; k < i; k++) {
				if (bingo[k] == bingo[i]){
					i--;
					break;
				}
			}
		}
		
//		System.out.println(Arrays.toString(bingo));
		
		
//		%d - 정수, %f - 실수, %c - 문자, %s - 문자열, %o - 8진수, %x - 16진수
		int end = 0;
		while (true) {
			System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
			for (int i = 0; i < 5; i++) {
				for (int k = 0; k < 5; k++) {
					if (bingo[i * 5 + k] == 0)
						System.out.printf("│ %3c ", '■');
					else
						System.out.printf("│ %3d ",bingo[i*5 + k]);
				}
				if (i == 4) 
					System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
				else
					System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
			}
			
			if (end == 5) {
				System.out.println("5줄 빙고 완성!!!");
				break;
			} else if (end > 5) {
				System.out.println("탈락");
				break;
			}
		
//		빙고를 위해 숫자 입력 만들기
			System.out.print(" 입력 : ");
			int user = sc.nextInt();
			for (int i = 0; i < bingo.length; i++) { // 배열 에서 내가 입력한 숫자 찾기
				if (bingo[i] == user) {
					bingo[i] = 0;
				}
			}
			
//		5줄이 완성되면 빙고가 끝나도록
			
			int row = 0, col = 0, cross1 = 0, cross2 = 0;
			end = 0;
			
//			가로빙고 = row, 세로빙고 = col, 대각선1 = cross1, 대각선2 = cross2
			for (int i = 0; i < 5; i++) {
				row = 0;
				col = 0;
				for (int k = 0; k < 5; k++) {
					if (bingo[i * 5 + k] == 0) row++;
					if (bingo[k * 5 + i] == 0) col++;
					
				}
				if (bingo[i * 5 + i] == 0) cross1++;
				if (bingo[(i * 5) + (5 - (i + 1))] == 0) cross2++;
				if (row == 5) end++;
				if (col == 5) end++;
			}
			if (cross1 == 5) end++;
			if (cross2 == 5) end++;
			
			System.out.println(" 현재 완성 빙고 : " + end + "줄");
		}
		
		sc.close();
	}

}
