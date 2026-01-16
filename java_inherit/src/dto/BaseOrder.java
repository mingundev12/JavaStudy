package dto;

import able.*;

public abstract class BaseOrder implements CafeOrder {

	protected String cafeName;
	protected String menuName;

	public BaseOrder(String cafeName, String menuName) {
		this.cafeName = cafeName;
		this.menuName = menuName;
	}

	@Override
	public void takeOrder() {
		System.out.println("[" + cafeName + "] 주문접수 : " + menuName);
	}


}
