package exam13;

public class Friend {

	String name; // 내 이름 (Data)
	Friend next; // 내 뒤에 있는 친구 (Address)
	
	Friend(String name) {
		this.name = name;
		this.next = null;
	}
}
