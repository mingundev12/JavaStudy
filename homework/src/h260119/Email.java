package h260119;

public class Email implements Notifier{
	private String name;
	private int count;

	public Email(String name) {
		this.name = name;
		count = 0;
	}

	@Override
	public void send(String message) {
		count ++;
		System.out.println(name + "(읽지 않은 메일 - " + count + ") : " + message);
	}

}
