package exam12;

public class SimpleLinkedList {

	public static void main(String[] args) {
		Friend f1 = new Friend("철수");
		Friend f2 = new Friend("영희");
		Friend f3 = new Friend("민수");
		
		f1.next = f2;
		f2.next = f3;
		
		Friend current = f1;
		
		while (current != null) {
			System.out.print(current.name + " -> ");
			current = current.next;
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		Friend newNode = new Friend("짱구");
		
		newNode.next = f1.next;
		f1.next = newNode;
		
		current = f1;
		
		while (current != null) {
			System.out.print(current.name + " -> ");
			current = current.next;
		}
	}
}
