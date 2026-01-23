package h260119;

import java.time.LocalDateTime;

public class MainMethod {

	public static void main(String[] args) {
		Notifier email = new Email("이메일");
		Notifier sms = new Sms("문자메세지");
		Notifier app = new App("앱 푸시알림");

		String date = LocalDateTime.now().toString().substring(0, 10);
		String msg = date + "의 날씨는 맑음";
		
		email.send(msg);
		sms.send(msg);
		app.send(msg);
		
		
		msg = "스트레스 받을 거야. 코딩 공부 많이 된다.";
		
		email.send(msg);
		sms.send(msg);
		app.send(msg);
	}

}
