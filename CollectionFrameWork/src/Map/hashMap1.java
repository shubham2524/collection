package Map;
//keys should be uinque outherwise override


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMap1 {
	public static void main(String[] args) {
		// not sorted

		Map<String, Integer> emp = new HashMap<String, Integer>();
		emp.put("Shubham", 101);
		emp.put("Saurabh", 102);
		emp.put("suman", 103);
		System.out.println(emp);
		emp.remove("suman");
		System.out.println(emp);

		for (Map.Entry<String, Integer> n : emp.entrySet()) {
			System.out.println(n);
		}
		for (String s : emp.keySet()) {
			System.out.println(s);
		}

		for (Integer v : emp.values()) {
			System.out.println(v);
		}

		// sorted
		Map<String, Integer> emp1 = new TreeMap<String, Integer>();
		emp1.putAll(emp);
		System.out.println(emp1);
	}

}
