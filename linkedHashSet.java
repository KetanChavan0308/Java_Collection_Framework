package JavaCollection;

import java.util.LinkedHashSet;

public class linkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		s.add(10);
		s.add(4);
		s.add(8);
		s.add(7);
		s.add(7);
		s.add(null);
		System.out.println(s);
		LinkedHashSet<Character> sc = new LinkedHashSet<>();
		sc.add('w');
		sc.add('e');
		System.out.println(sc);

	}

}
