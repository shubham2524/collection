package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLists {
	// FIRST IN FIRST OUT
	//offer()
	//poll()
	//peek()

	public static void main(String[] args) {
		
		Queue<Integer> ticket = new LinkedList<>();
		ticket.offer(78);
		ticket.offer(86);
		ticket.offer(45);
		
		System.out.println(ticket);
		
		ticket.poll();
		System.out.println(ticket);
		
		System.out.println(ticket.peek());
		

	}

}
