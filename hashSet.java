package JavaCollection;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		s.add(10);
		s.add(4);//natural sorting
		s.add(4);//dublication not allowed
		s.add(null);//more priority
		System.out.println(s);
		HashSet<Character> sc=new HashSet<>();
		sc.add('w');
		sc.add('e');
		System.out.println(sc);
		

	}

}
