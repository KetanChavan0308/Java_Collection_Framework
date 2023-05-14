package JavaCollection;

import java.util.LinkedHashMap;

public class linkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> s = new LinkedHashMap<>();
		s.put(1, 9);
		s.put(2, 2);
		s.put(7, 90);
		s.put(1, 4);
		s.put(3, 7);
		System.out.println(s);

	}

}
