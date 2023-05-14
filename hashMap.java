package JavaCollection;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> s = new HashMap<>();
		s.put(1, "Ketan");
		s.put(2, "Mayuri");
		s.put(3, "apple");//
		s.put(3, "apple");//it cannot contain dublicate keys.
		s.put(3, "home");// if same key the take a value which is in assending order first.
		s.put(4, "Father");
		s.put(5, "Daughter");
		s.put(3, "apple");//it does not maintain insertion order.
		s.put(null, null);//more priority
		System.out.println(s);

	}

}
