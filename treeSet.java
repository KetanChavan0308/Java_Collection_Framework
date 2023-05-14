package JavaCollection;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		s.add(7);
		//s.add(null); not allowed
		System.out.println(s);

	}

}
