package h260119;

public class App implements Notifier {
	String name;

	public App(String name) {
		this.name = name;
	}

	@Override
	public void send(String message) {
		System.out.println(name + " : " + message);
	}

}
