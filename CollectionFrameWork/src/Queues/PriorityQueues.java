package Queues;

import java.util.PriorityQueue;

public class PriorityQueues {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> tickets = new PriorityQueue<>();
		
		tickets.offer(34);
		tickets.offer(45);
		tickets.offer(0);
		tickets.offer(46);
		
		System.out.println(tickets);
		
		tickets.poll();
		System.out.println(tickets);
		
		
				



	}

}
