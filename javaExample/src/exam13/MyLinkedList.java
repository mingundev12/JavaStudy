package exam13;

public class MyLinkedList {

	private Node head; // 첫번째 노드를 가리키는 변수
	private int size = 0;
	
	private class Node {
		Object data;
		Node next;
		
		Node(Object input) {
			this.data = input;
			this.next = null;
		}
	}
	
//	새로운 노드를 만들고 맨 앞에 붙이는 원리
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
//	연결된 고리를 타고 하나씩 이동
	public Object get(int index) {
		Node temp = getNode(index);
		return temp.data;
	}
	
//	해당하는 인덱스의 노드 찾기
	public Node getNode(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public String toString() {
		if (head == null) return "[]";
		
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}
	
//	중간에 끼워넣기
	public void add(int index, Object input) {
		if (index == 0) {
			addFirst(input);
			return;
		}
		Node newNode = new Node(input);
//		삽입할 위치의 바로 전 노드를 찾음
		Node prev = getNode(index - 1);
//		새로운 노드의 연결고리를 먼저 설정
		newNode.next = prev.next;
//		이전 노드가 새로운 노드를 가리키게 함
		prev.next = newNode;
		size++;
	}
	
//	삭제하기
	public Object remove(int index) {
		if (index == 0) {
			Object data = head.data;
			head = head.next;
			size--;
			return data;
		}
		
		Node prev = getNode(index - 1);
		Node toDelete = prev.next;
		prev.next = toDelete.next;
		Object returnData = toDelete.data;
		toDelete = null;
		size--;
		return returnData;
	}
}
