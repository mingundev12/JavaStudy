package dto;

import able.Attendance;

public class CardAttend implements Attendance {
	
	private boolean present = false;

	@Override
	public void checkIn() {
		present = true; // 출석 했다.
		System.out.println("카드 출석 완료");
	}

	@Override
	public void checkOut() {
		present = false; // 퇴실 했다.
		System.out.println("카드 퇴실 완료");
	}

	@Override
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return present;
	}

}
