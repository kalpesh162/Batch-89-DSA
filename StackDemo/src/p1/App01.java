package p1;

class MyStack {
	int arr[];
	int top;

	public MyStack(int size) {
		arr = new int[size];
		top = -1;
	}

	int push(int ele) {
		if (isFull()) {
			return -1; // throw EmptyStackException
		}
		arr[top + 1] = ele;
		top++;

		return arr[top];
	}

	int pop() {
		if (isEmpty()) {
			return -1; // throw EmptyStackException
		}

		int val = arr[top];
		top--;
		return val;
	}

	int peek() {

		if (isEmpty()) {
			return -1; // throw EmptyStackException
		}

		int val = arr[top];
		return val;
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == arr.length - 1;
	}

	void printStack() {
		System.out.println("***** PRINT STACK  ELEMENTS  *****");
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
	}

}

public class App01 {

	public static void main(String[] args) {

	}

}
