package p1;

public class App01 {
	
	public static void main(String[] args) {
		
		LinearQueue q1=new LinearQueue(5);
		q1.push(11);
		q1.push(22);
		q1.push(33);
		q1.push(44);
		q1.push(55);
		
		System.out.println(q1.pop());
		
		System.out.println("-------------------");
		
		q1.displayQueue();
	}

}
