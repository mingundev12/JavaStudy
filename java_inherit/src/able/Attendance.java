package able;

public interface Attendance {
	
	void checkIn();
	void checkOut();
	boolean isPresent();

}


/* 
 *	출결 시스템 만들기
 *	출결은 무엇을 해야 하는가?
 *	출석, 퇴실, 현재 출석 상태
 * 
 * 	카드출결 클래스
 * 	카드 찍는다.
 * 	찍었을때 출석 true, 퇴실 false
 * 
 * 	앱출결 클래스
 *
 * 
 */