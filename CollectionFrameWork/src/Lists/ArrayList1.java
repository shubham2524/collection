package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		// maintain insertion
		// duplicates are allowed
		//null allowed
		//multiple data allowed 
		
		
		ArrayList a = new ArrayList();
		a.add("shubham");
		a.add(null);
		a.add("shubham");
		a.add(46);
		
		System.out.println(a);
		
		ArrayList<String> students = new ArrayList<String>();

		students.add("shubham");
		students.add("saurabh");
		students.add("singh");
		students.add("shubham");
		students.add(3, "ram");
		students.addFirst("shyam");
		students.addLast("mohan");

		System.out.println(students);
		students.get(2);

		students.remove(2);
		students.remove(String.valueOf("ram"));
		System.out.println(students);
		students.set(1, "firstIndex");
		students.contains("shubham");
		
		System.out.println(students);

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		System.out.println("--------------");
		for (String s : students) {
			System.out.println(s);
		}

	}

}
