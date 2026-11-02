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

	Node createNewNode(int data) {
		Node newNode = new Node(data);

		return newNode;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	

}
