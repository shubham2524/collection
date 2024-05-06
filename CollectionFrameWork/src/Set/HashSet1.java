package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	//dupliction not allowed
	//insertion not maintained 

	public static void main(String[] args) {
		
		Set<Integer> element = new HashSet<>();
		element.add(34);
		element.add(45);
		element.add(45);
		element.add(89);
		
		System.out.println(element);
		element.remove(89);
		System.out.println(element);
		System.out.println(element.contains(45));
		System.out.println(element.isEmpty());
		element.clear();
		System.out.println(element);
		
		
	}

}
