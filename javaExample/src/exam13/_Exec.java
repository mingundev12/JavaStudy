package exam13;

public class _Exec {
	public static void main(String[] args) {
		MyLinkedList myLR = new MyLinkedList();
		
		myLR.addFirst("30");
		myLR.addFirst("20");
		myLR.addFirst("10");
		
		System.out.println("전체 리스트 : " + myLR);
		System.out.println("1번 인덱스 값 : " + myLR.get(1));
		
		myLR.add(1, "50");
		System.out.println("전체 리스트 : " + myLR);
		System.out.println("1번 인덱스 값 : " + myLR.get(1));
	}
}
