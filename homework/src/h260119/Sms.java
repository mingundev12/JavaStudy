package h260119;

public class Sms implements Notifier{
	String name;
	
	public Sms(String name) {
		this.name = name;
	}

	@Override
	public void send(String message) {
		System.out.println(name + " : " + message);
	}

}
