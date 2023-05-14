package JavaCollection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
	Stack<Integer> s= new Stack<>();
	s.add(10);
	s.add(30);
	s.add(null);
	s.add(10);
	s.add(1, 3);
	System.out.println(s);
	}

}
