package exam16;

import java.util.Scanner;

public class CustomExceptionEx {
	
	public static void checkAge(int age) throws Exception {
		if (age < 0) {
//			강제로 예외를 발생시킴(메세지를 담아서)
			throw new InvalidAgeException("나이는 0보다 작을 수 없습니다.");
		}
		System.out.println("정상적인 나이입니다 : " + age);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int inputAge = sc.nextInt();
		
		try {
			checkAge(inputAge);
		} catch (InvalidAgeException e) {
//			e.printStackTrace();
			System.out.println("??? : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("[발생한 예외] : " + e.getMessage());
		}finally {
			sc.close();
		}

	}

}

//	throws 사용하는 이유 : 각각의 메서드에서 개별로 예외처리를 하는 것이 아닌
//						예외를 모아서 한꺼번에 처리하기 위해 메서드를 호출한 쪽으로 던지는 것