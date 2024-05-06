package Lists;

import java.util.Stack;

public class Stacks1 {

	public static void main(String[] args) {
		//push()
		//pull()
		//peek()
		Stack<Integer> coins = new Stack<Integer>();
		coins.push(10);
		coins.push(56);
		coins.push(67);
		coins.push(23);
		
		System.out.println(coins);
		
		System.out.println(coins.peek());
		coins.pop();
		System.out.println(coins);

	}

}
