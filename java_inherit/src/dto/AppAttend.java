package dto;

import able.Attendance;

public class AppAttend implements Attendance {
	
	private boolean present = false;

	@Override
	public void checkIn() {
		present = true;
		System.out.println("앱 출석 완료");
	}

	@Override
	public void checkOut() {
		present = false;
		System.out.println("앱 퇴실 완료");
	}

	@Override
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return present;
	}

}
