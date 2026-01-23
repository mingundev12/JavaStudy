package exam28;

public class Example {

	public static void main(String[] args) {
		
		ProductListProcess proc = new ProductListProcess();

		while (!proc.menuNumberIsZero()) {
			try {
				proc.chooseMenu();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("메뉴선택으로 돌아갑니다.");
			} 

		}
	}
	
}
