package exam16;

public class ThrowsEx {
	
	public static void divide(int n) throws ArithmeticException {
		int result = 10 / n;
		System.out.println("결과 : " + result);
	}
	
	public static void middleStep(int n) throws ArithmeticException {
		divide(n);
	}
	
	public static void main(String[] args) {
		try {
			middleStep(0);
		} catch (ArithmeticException e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
}
