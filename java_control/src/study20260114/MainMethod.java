package study20260114;

public class MainMethod {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		GameMember[] gameMembers = connect.findAll();
		
		for (GameMember member : gameMembers) {
			System.out.println(member);
		}
		
		Item[] items = connect.findItem();
		
		for (Item item : items) {
			System.out.println(item);
		}
	}

}
