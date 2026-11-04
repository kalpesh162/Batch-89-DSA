package p1;

public class DoublyLinkedList {

	static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

	}

	private Node head;

	public DoublyLinkedList() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {

			newNode.next = head;
			head.prev = newNode;
			head = newNode;

		}

	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			newNode.prev = trav;
			trav.next = newNode;

		}

	}

	public void deleteFirst() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		}

		head = head.next;
		head.prev = null;
	}

	public void deleteLast() {
		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			return;
		} else {
			Node trav = head;
			Node trav_bk = null;
			while (trav.next != null) {
				trav_bk = trav;
				trav = trav.next;
			}

			trav.prev = null;
			trav_bk.next = null;

		}
	}

	public void printList() {
		System.out.println("===== Printing List .......");

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ===>");
			temp = temp.next;
		}

		System.out.println();
		System.out.println("-------------------------");

	}

}
