package test;

public class Test1 {

	public static void main(String[] args) {

//		문제 1
//		사각형의 너비와 높이는 각각 다음과 같다
//		너비 : 50, 높이 : 20
//		사각형의 넓이를 계산하여 출력하세요.
//		변수는 반드시 3개 사용!!!

//		1 data = 1 variable

//		declare variable of width, height, and area
		int width = 0; // 사각형 너비
		int height = 0; // 사각형 높이
		int area = 0; // 사각형 넓이

//		set value of width and height
		width = 50;
		height = 20;

//		calculate area of rectangle
		area = width * height;

//		print area of rectangle
//		System.out => C 언어로 된 객체를 호출해서 처리하는것. Java 언어는 스스로 입출력을 할 수 없다.
//		(print)ln = line, 한 줄에 출력한다는 뜻 => 그래서 자동으로 계행이 됨
		System.out.println(" 사각형 넓이 : " + area);
//		System.out.println("area of rectangle : " + width + "(width) * " + height + "(height) = " + area);

//		문제 2
//		국어 점수 : 80, 영어 점수 : 70, 수학 점수 : 85
//		세 과목의 총합과 평균을 구하여 출력하세요.

//		declare score of three subjects
		int scoreKor = 0, // 국어 점수
				scoreEng = 0, // 영어 점수
				scoreMath = 0; // 수학 점수
		int scoreTotal = 0; // 세 과목의 총점
		float scoreAvgF = 0.0f; // 세 과목의 평균
		double scoreAvgD = 0.0d;

//		set value of scores
		scoreKor = 80;
		scoreEng = 70;
		scoreMath = 85;

//		calculate Total, Average
		scoreTotal = scoreKor + scoreEng + scoreMath;
		scoreAvgF = scoreTotal / 3.0f;
		scoreAvgD = scoreTotal / 3.0d;

//		print total and average
		System.out.println(" 총점 : " + scoreTotal);
		System.out.println(" 평균(float) : " + scoreAvgF + "\n 평균(double) : " + scoreAvgD);
//		float 와 double 의 오차 확인

//		문제 3
//		1 부터 10까지 출력하세요 (반복문 사용)
//		단, 5는 숫자를 출력하지말고 pass 라고 출력하기
//		결과 화면 예시)
//		1
//		2
//		3
//		4
//		pass
//		6
//		7
		
//		loop from 1 to 10, if number equals 5 -> print "pass"
		for (int i = 0; i < 10; i++) {
			if ((i + 1) == 5)
				System.out.println("pass");
			else
				System.out.println((i + 1));
		}

//		end of program

	}

}
