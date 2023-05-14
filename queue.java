package JavaCollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> s = new PriorityQueue<>();
		s.add(1);
		s.add(9);
		s.add(5);
		s.add(1);
		s.add(3);
		s.add(5);
		s.add(8);
		s.add(7);
	
		//s.add(null);
		System.out.println(s);

	}

}
