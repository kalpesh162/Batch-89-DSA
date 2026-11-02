package p1;

public class SinglyLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	private Node head;

	public SinglyLinkedList() {
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
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {

			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;

		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.err.println("List is EMPTY");
			return;
		} else {
			head = head.next;
		}
	}

	public void deleteLast() {
		if (head == null) {
			System.err.println("List is EMPTY");
			return;
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			Node trav_bk = null;

			while (trav.next != null) {
				trav_bk = trav;
				trav = trav.next;
			}

			trav_bk.next = null;
		}
	}

	// add(int pos, E e)

	public void addAtPos(int pos, int data) {
		if (pos <= 0) {
			System.err.println("Not valid :: Pos " + pos);
			return;
		}
		if (pos == 1)
			addFirst(data);

		else {
			Node temp = head;
			Node newNode = new Node(data);
			for (int i = 1; i < pos - 1; i++) {
				if (temp.next == null)
					return;
				temp = temp.next;

			}
			newNode.next = temp.next;
			temp.next = newNode;
		}

	}

	public void printList() {
		System.out.println("===== Printing List .......");

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ===>");
			temp = temp.getNext();
		}

		System.out.println();
		System.out.println("-------------------------");

	}

}
