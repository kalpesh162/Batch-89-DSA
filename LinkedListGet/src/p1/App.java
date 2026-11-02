package p1;

import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		System.out.println(""+list.size());
		
		list.add(11);
		System.out.println(""+list.size());
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		
		System.out.println("====>  "+list.get(2));
		System.out.println("====>  "+list.get(0));
		
		
	}

}
