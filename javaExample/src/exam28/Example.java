package exam28;

public class Example {

	public static void main(String[] args) {
		
		ProductListProcess pl = new ProductListProcess();

		while (!pl.menuNumberIsZero()) {
			System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) : ");
			try {
				pl.selectMenu();
			} catch (Exception e) {
				System.out.println("메뉴선택, 품목가격, 수량은 올바른 숫자를 입력하세요");
				System.out.println("메뉴선택으로 돌아갑니다.");
			} 

		}
	}

}
