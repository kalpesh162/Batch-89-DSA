package p1;

class LinearQueue {
	int arr[];
	int front;
	int rear;

	public LinearQueue(int size) {
		arr = new int[size];
		front = rear = -1;
	}

	boolean isFullQueue() {
		return rear == arr.length - 1;
	}

	boolean isEmptyQueue() {
		return (front == rear || (front == -1 && rear == -1));
	}

	int push(int ele) {
		if (isFullQueue()) {
			return -1; // throw exception
		}
		rear++;
		arr[rear] = ele;
		return arr[rear];

	}

	int pop() {
		if (isEmptyQueue()) {
			return -1; // throw exception
		}

		front++;

		return arr[front];

	}

	void displayQueue() {

		for (int i = front + 1; i <= rear; i++)
			System.out.print(arr[i] + "  ==>  ");
	}

}
