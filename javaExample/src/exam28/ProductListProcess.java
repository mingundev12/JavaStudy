package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductListProcess {

	List<ProductDTO> ProductList;
	Scanner sc;
	int menuNumber;
	
//	Constructor
	public ProductListProcess() {
		this.ProductList = new ArrayList<>();
		this.sc = new Scanner(System.in);
		this.menuNumber = -1;
	}

//	Public Method
	public boolean menuNumberIsZero() {
		return menuNumber == 0;
	}
	
	public void chooseMenu() throws Exception {
		System.out.print("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제) : ");
		menuNumber = getNumber();
		switch (menuNumber) {
		case 0:
			endProgram();
			break;
		case 1:
			printProducts();
			break;
		case 2:
			addProduct();
			break;
		case 3:
			replaceProduct();
			break;
		case 4:
			deleteProduct();
			break;
		default:
			throwExceptionWrongInput();
		}
	}
	
//	Private Method
//	Menu = 0 / 종료
	private void endProgram() {
		System.out.println("프로그램 종료");
	}

//	Menu = 1 / 목록출력
	private void printProducts() throws Exception {
		System.out.println("- 목록 -");
		
		if(ProductList.size() == 0) {
			throwExceptionThereNoProduct();
		}
		
		int total = 0;
		for (ProductDTO product : ProductList) {
			product.display();
			total += product.getTotal();
		}
		System.out.println("-------------------------");
		System.out.println("합 계 : " + total);
	}

//	Menu = 2 / 상품추가
	private void addProduct() throws Exception {
		System.out.println("- 등록 -");
		
		System.out.print("상품명 : ");
		String productName = getString();
		System.out.print("가격 : ");
		int price = getNumber();
		System.out.print("수량 : ");
		int buyCounter = getNumber();
		
		ProductList.add(new ProductDTO(productName, price, buyCounter));
		
		System.out.println("상품 등록이 완료되었습니다.");
	}

//	Menu = 3 / 상품수정
	private void replaceProduct() throws Exception {
		System.out.println("- 수정 -");
		
		if(ProductList.size() == 0) {
			throwExceptionThereNoProduct();
		}

		System.out.print("수정할 상품명 : ");
		String productName = getString();
		
		int index = searchProductIndexByName(productName);
		
		if (index == -1) {
			throwExceptionThereNoProduct();
		}
		System.out.print("수정할 가격 : ");
		int price = getNumber();
		ProductList.get(index).setProductPrice(price);
		System.out.print("수정할 수량 : ");
		int buyCounter = getNumber();
		ProductList.get(index).setBuyCounter(buyCounter);
		ProductList.get(index).setTotal();
		
		System.out.println("상품수정이 완료되었습니다.");
	}

//	Menu = 4 / 상품삭제
	private void deleteProduct() throws Exception {
		System.out.println("- 삭제 -");
		
		if(ProductList.size() == 0) {
			throwExceptionThereNoProduct();
		}

		System.out.print("삭제할 상품명 : ");
		String productName = getString();
		
		int index = searchProductIndexByName(productName);
		
		if (index == -1) {
			throwExceptionThereNoProduct();
		}
		ProductList.remove(index);
		
		System.out.println("상품삭제가 완료되었습니다.");
	}
	
//	상품검색 (수정, 삭제용)
	private int searchProductIndexByName(String name) {
		for (int i = 0; i < ProductList.size(); i++) {
			if (ProductList.get(i).getProductName().equals(name)) { 
				return i;
			}
		}
		
		return -1;
	}

//	메뉴, 상품명, 가격, 수량 입력 메서드
	private int getNumber() throws Exception {
		try {
			return Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			throwExceptionWrongInput();
			return 0;
		}
	}
	
	private String getString() {
		return sc.nextLine();
	}
	
//	예외처리 메서드
	private void throwExceptionThereNoProduct() throws Exception {
		throw new Exception("해당하는 상품이 없습니다.");
	}
	
	private void throwExceptionWrongInput() throws Exception {
		throw new Exception("잘못된 입력입니다.");
	}
	
//	private void throwExceptionInsertedWrongNumber() throws Exception {
//		throw new Exception("메뉴, 상품가격, 수량은 숫자를 입력해주세요.");
//	}

}
