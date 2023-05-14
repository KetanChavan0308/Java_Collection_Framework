package JavaCollection;

public class PriorityQueue {

	public static void main(String[] args) {
		java.util.PriorityQueue<Integer> s = new java.util.PriorityQueue<>();
		s.add(10);
		s.add(4);
		s.add(8);
		s.add(2);
		s.add(7);
		s.add(7);
		s.add(3);
		//s.add(null);not allowed
		System.out.println(s);
	}

}
