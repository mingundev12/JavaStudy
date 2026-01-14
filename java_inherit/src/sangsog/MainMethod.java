package sangsog;

import products.*;

public class MainMethod {

	public static void main(String[] args) {

		Television tv = new Television();
		
		tv.power();
		tv.power();
		
		Refrigerator rfg = new Refrigerator();
		
		Aircon air = new Aircon("LG휘센", 310);
		
	}

}
