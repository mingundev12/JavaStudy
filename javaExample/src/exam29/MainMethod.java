package exam29;

public class MainMethod {

	public static void main(String[] args) {
		
		MemberManager manager = new MemberManager();

		while (!manager.menuIsZero()) {
			try {
				manager.chooseMenu();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("");
			}
		}
	}

}
