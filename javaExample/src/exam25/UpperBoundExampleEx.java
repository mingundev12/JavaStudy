package exam25;

import java.util.Arrays;
import java.util.List;

public class UpperBoundExampleEx {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10, 20, 30);
		List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
		
		System.out.println("Integer 합계 : " + UpperBoundExample.sumOfList(intList));
		System.out.println("Integer 합계 : " + UpperBoundExample.sumOfList(doubleList));
	}
}
