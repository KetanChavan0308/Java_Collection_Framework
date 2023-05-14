package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(10);
		s.add(30);
		s.add(20);
		s.add(2, 20);
		s.add(50);
		s.add(40);
		System.out.println(s);
		Collections.sort(s);
		System.out.println(s);
		Collections.reverse(s);
		System.out.println(s);
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Ketan");
		s1.add("Chavan");
		s1.add("Mayuri");
		s1.add("Chavan");
		s1.add("Shravya");
		System.out.println(s1);
		Collections.sort(s1);
		System.out.println(s1);
		System.out.println(s1.get(1));
	}

}
/*
 * ArrayList can grow and shrink automatically based on the addition and removal
 * of elements. ArrayList can contain duplicate elements ArrayList maintains the
 * insertion order, which means the elements appear in the same order in which
 * they are inserted. ArrayList is non synchronized. However you can make it
 * synchronized.
 */