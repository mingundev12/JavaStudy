package study20260109;

public class TestAdv02 {

	public static void main(String[] args) {
		
//		문제 2
//		출결 코드 / 1 - 출석 / 2 - 지각 / 3 - 결석
		int[] attendance = { 1, 1, 2, 1, 3, 1, 2, 3, 1, 1, 1, 2, 3, 3, 1 };
		int count1 = 0, count2 = 0, count3 = 0, score = 0;

		for (int att : attendance) {
			switch (att) {
			case 1 :
				count1++;
				score++;
				break;
			case 2 : 
				count2++;
				break;
			case 3 :
				count3++;
				score--;
				break;
			}
		}
		
		System.out.println("출석 : " + count1 + "회");
		System.out.println("지각 : " + count2 + "회");
		System.out.println("결석 : " + count3 + "회");
		System.out.println("출석점수 : " + score + "점");
		if (count3 >= 3 || score <= 8)
			System.out.println("출결 위험");
	}

}
