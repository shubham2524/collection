package Queues;

import java.util.ArrayDeque;

public class ArrayDeck {

	public static void main(String[] args) {
		//offer()
		//offerFirst()
		//offerLast()
		//poll()
		//pollFirst()
		//pollLast()
		//peek()
		//peekFirst()
		//peekLast()
		
		
		ArrayDeque<Integer> a  = new ArrayDeque<Integer>();
		a.offer(45);
		a.offer(67);
		a.offer(56);
		a.offerFirst(34);
		a.offerLast(65);
		System.out.println(a);
		a.poll();
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());

	}

}
