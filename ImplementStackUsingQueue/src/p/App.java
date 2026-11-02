package p;

public class App {

	public static void main(String[] args) {
		LinearQueue q1 = new LinearQueue(5);

		System.out.println(q1.push(11));
		System.out.println(q1.push(12));
		System.out.println(q1.push(13));
		System.out.println(q1.push(14));
		System.out.println(q1.push(15));

		System.out.println("pop  "+q1.pop());

		System.out.println("-------------------");

		q1.displayQueue();
	}

}
