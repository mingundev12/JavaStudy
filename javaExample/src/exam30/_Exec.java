package exam30;

import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentProcess process;
		
		try {
			process = new StudentProcess(sc);
		} catch (Exception e) {
			System.out.println("접속에 실패하였습니다. 다시 시도해 주세요.");
			return;
		}
		
		while (!process.getProgramExit()) {
			try {
				process.selectMenu();
			} catch (Exception e) {
//				System.out.println(e.getMessage());
				System.out.println("예외 발생. 메뉴로 돌아갑니다.");
			}
		}
		
		sc.close();

	}

}
