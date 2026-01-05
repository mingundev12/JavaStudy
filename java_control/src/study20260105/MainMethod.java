package study20260105;

public class MainMethod {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
//		Integer.parseInt(String) 정수값으로 변경할 수 있다.
//		Math.floor() 소수점 자르기
//		int num = (int) Math.floor(Math.random() * 10) + 1;
//
//		System.out.println("1~10" + num);
//
//		num = (int) Math.floor(Math.random() * 9) + 7;
//
//		System.out.println("7~15" + num);
//		
//		num = (int) Math.floor(Math.random() * 97) + 23;
//		
//		System.out.println("23~119" + num);

//		동전의 앞면 뒷면 맞추기

//		int coin = (int) Math.floor(Math.random() * 2) + 1;
////		1- 앞면, 2- 뒷면
//		
//		System.out.println("동전 앞면 뒷면 맞추기");
//		System.out.print("1-앞면, 2-뒷면 \n 입력 : ");
//		int user = sc.nextInt();
//		
//		if(user == coin)
//			System.out.println("맞추기 성공!!");
//		else
//			System.out.println("맞추기 실패......");

//		int dice = (int) Math.floor(Math.random() * 6) + 1;
//		System.out.println("주사위 맞추기 게임!");
//		System.out.print("1~6 중에 하나 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num == dice)
//			System.out.println("맞추기 성공!");
//		else
//			System.out.println("맞추기 실패..");

////		컴퓨터 주사위
//		int com = (int) Math.floor(Math.random() * 6) + 1;
//		
////		나의 주사위
//		int user = (int) Math.floor(Math.random() * 6) + 1;
//		
////		내가 컴퓨터보다 큰가? 작은가? 아니면 비김?
//		if ((user > com || (user == 1 && com == 6)) && !(user == 6 && com == 1))
//			System.out.println(" 나의 승!!");
//		else if (user == com)
//			System.out.println(" 비김....");
//		else
//			System.out.println(" 나의 패배....");
		
//		컴퓨터 와 함께 하는 가위바위보 게임!!
//		1-가위, 2-바위, 3-보
		
//		컴퓨터의 가위바위보는 랜덤으로
//		나의 가위바위보 값은 키보드 입력으로
//		내가 이겼는지, 졌는지, 비겼는지 출력하세요!!~
		
		int com = (int) Math.floor(Math.random() * 3) + 1;
		
		System.out.println("가위바위보 게임!");
		System.out.println("가위:1, 바위:2, 보:3");
		System.out.print("가위바위보 입력 : ");
		int user = sc.nextInt();
		
		if ((user > com || (user == 1 && com == 3)) && !(user == 3 && com == 1))
			System.out.println("나의 승리! (" + user + " vs " + com + ")");
		else if (user == com)
			System.out.println("비겼다. (" + user + " vs " + com + ")");
		else
			System.out.println("나의 패배 (" + user + " vs " + com + ")");
	}

}

