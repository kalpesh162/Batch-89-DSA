package p1;

public class App {

	public static void main(String[] args) {

		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.addLast(11);
		linkedList.addLast(22);
		linkedList.addLast(33);
		linkedList.addLast(44);
		linkedList.addLast(55);
		
		linkedList.printList();
		
		
		linkedList.addAtPos(1, 99);
		linkedList.printList();
		linkedList.addAtPos(2, 88);
		linkedList.printList();
		linkedList.addAtPos(3,77);
		linkedList.printList();
		
		
	}

}
