package products;

import common.Appliance;

public class Television extends Appliance {  // TV

	public int ch;
	public int sound;
	
	@Override
	public void power() {
		onoff = !onoff;
		
		System.out.println("TV 전원이 " + (onoff ? "켜짐" : "꺼짐"));
	}

	
}
