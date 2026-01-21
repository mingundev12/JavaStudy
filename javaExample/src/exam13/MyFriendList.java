package exam13;

public class MyFriendList {
	Friend head;
	
	public void add(String name) {
		Friend newNode = new Friend(name);
		if(head == null) {
			head = newNode;
			return;
		}
	}

}
