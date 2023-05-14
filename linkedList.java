package JavaCollection;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<Integer> s = new LinkedList<>();
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		s.add(7);
		s.add(null);
		System.out.println(s);

	}

}
/***************OUTPUT***************
[10, 9, 8, 7, 7, null]
****************************************/