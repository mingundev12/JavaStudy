package h260124;

public class MainMethod {

	public static void main(String[] args) {

		JobMatcher matcher = new JobMatcher(); // JobMatcher 클래스의 객체를 생성하여 데이터를 처리
		
		while (!matcher.isExit()) {
			matcher.selectMenu();
		}
	}

}

