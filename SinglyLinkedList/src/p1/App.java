package p1;

import p1.SinglyLinkedList.Node;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		Node newNode = new Node(11);

		list.setHead(newNode);

		Node newNode1 = new Node(22);

		list.getHead().setNext(newNode1);

		Node newNode2 = new Node(33);

		list.getHead().getNext().setNext(newNode2);

		Node temp = list.getHead();

		while (temp != null) {
			System.out.print(temp.getData() + "===>");
			temp = temp.getNext();
		}

	}

}
