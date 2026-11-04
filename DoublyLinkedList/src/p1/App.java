package p1;

public class App {

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();

		list.addLast(11);
		list.addLast(22);
		list.addLast(33);
		list.addLast(44);
		list.addLast(55);

		list.printList();

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			System.err.println("After Deleting   " + i);
			list.deleteLast();
			list.printList();
		}

	}

}
