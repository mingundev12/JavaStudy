package exam11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotteryExec {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		System.out.println("------> " + lotto.size());
		Random random = new Random();
		
		while (lotto.size() < 6) {
			int num = random.nextInt(45) + 1;
//			System.out.println("num : " + num);
			
			lotto.add(num);
		}
		
		System.out.println("lotto : " + lotto);
		
	}

}
