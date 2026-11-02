package p;

class LinearQueue {
	int arr[];
	int front;
	int rear;

	public LinearQueue(int size) {
		arr = new int[size];
		front = rear = -1;
	}

	boolean isFullQueue() {
		return front == arr.length - 1;
	}

	boolean isEmptyQueue() {
		return (front == rear || (front == -1 && rear == -1));
	}

	int push(int ele) {
		if (isFullQueue()) {
			return -1; // throw exception
		}
		front++;
		System.out.println("===>   "+front);
		arr[front] = ele;
		System.out.println("===>   "+arr[front]);
		return arr[front];

	}

	int pop() {
		if (isEmptyQueue()) {
			return -1; // throw exception
		}
		int val=arr[front];
		front--;
		return front;

	}

	void displayQueue() {

		for (int i = front; i >= 0; i--)
			System.out.print(arr[i] + "  ==>  ");
	}

}
