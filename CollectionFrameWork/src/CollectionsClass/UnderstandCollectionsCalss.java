package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnderstandCollectionsCalss {
	
	public static void main(String [] arg) {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(35);
		num.add(56);
		num.add(78);
		num.add(45);
		num.add(765);
		num.add(56);
		
		System.out.println(Collections.min(num));
		System.out.println(Collections.max(num));
		System.out.println(Collections.frequency(num,56));
		Collections.sort(num);
		System.out.println(num);
		Collections.sort(num,Comparator.reverseOrder());
		System.out.println(num);
	}

}
