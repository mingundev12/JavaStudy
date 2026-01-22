package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductListProcess {

	List<Product> list;
	Scanner sc;
	int menuNumber;
	
	public ProductListProcess() {
		this.list = new ArrayList<>();
		this.sc = new Scanner(System.in);
		this.menuNumber = -1;
	}
	
	public boolean menuNumberIsZero() {
		return menuNumber == 0;
	}
	
	public void selectMenu() throws Exception {
		getMenuNumber();
		switch (menuNumber) {
		case 0:
			System.out.println("프로그램 종료");
			return;
		case 1:
			print();
			break;
		case 2:
			add();
			break;
		case 3:
			replace();
			break;
		case 4:
			delete();
			break;
		default:
			throw new Exception();
		}
	}

	private void getMenuNumber() throws Exception {
		menuNumber = Integer.parseInt(sc.nextLine());
	}

	public void print() {
		System.out.println("- 목록 -");
		
		
	}

	public void add() {
		System.out.println("- 등록 -");

	}

	public void replace() {
		System.out.println("- 수정 -");

	}
	
	public void delete() {
		System.out.println("- 삭제 -");

	}

}
