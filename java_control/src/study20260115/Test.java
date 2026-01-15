package study20260115;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 2, 1};
		
		
//		int[] arr2 = Arrays.copyOfRange(arr, 0, 3);
//		
//		arr = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr2)).toArray();
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		arr = new int[] {-1};
//
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		int[] answer = solution(arr);
		
//		for(int i : answer) {
//			System.out.println(i);
//		}
		
//		System.out.println(Arrays.binarySearch(arr, 3));
	}
//	public static int[] solution(int[] arr) {
//        int[] answer = {};
//        
//        int min = arr[0];
//        for(int i = 0; i < arr.length; i++) {
//            min = min > arr[i] ? arr[i] : min;
//        }
//        System.out.println(min);
//        int index = -1;
//        for(int i = 0 ; i < arr.length; i++) {
//        	if (arr[i] == min) index = i;
//        }
//        System.out.println(index);
//        
//        if (index == -1) {
//            answer = new int[] {-1};
//        }
//        while (index != -1) {
//            answer = IntStream.concat(Arrays.stream(answer), Arrays.stream(Arrays.copyOfRange(arr, 0, index))).toArray();
//            arr = Arrays.copyOfRange(arr, index, arr.length);
//    		
//    		for(int i : arr) {
//    			System.out.print(i);
//    		}
//            index = -1;
//            for(int i = 0 ; i < arr.length; i++) {
//            	if (arr[i] == min) index = i;
//            }
//        }
//        
//        
//        return answer;
//    }
}
