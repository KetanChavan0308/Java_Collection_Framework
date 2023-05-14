package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class javaCollection {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("********************Array list*****************");
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(10);
		s.add(30);
		s.add(1, 20);
		s.set(0, 40);
		System.out.println(s);
		for (int x : s) {
			System.out.println(x);
		}
		s.clear();
		System.out.println(s);
		Thread.sleep(1000);
		System.out.println("********************Linked list****************");
		LinkedList<String> s1 = new LinkedList<String>();
		s1.addFirst("java");
		s1.add(1, "Automation");
		s1.add("new");
		s1.equals(s1);
		System.out.println(s1);
		s1.remove(2);// remove 2 index elements
		System.out.println(s1);
		System.out.println(s1.get(0));// print only 0 index elements
		Thread.sleep(1000);
		System.out.println("********************Vector****************");
		Vector<Integer> s2 = new Vector<Integer>();
		s2.add(2);
		s2.add(2);
		s2.add(7);
		s2.add(1);
		s2.add(4, 5);
		System.out.println(s2);
		Thread.sleep(1000);
		System.out.println("********************Stack****************");
		Stack<String> s3 = new Stack<String>();
		s3.add("Java");
		s3.push("Computer");
		s3.push("Programming");
		s3.push("new");
		System.out.println(s3);
		s3.pop();
		for (String y : s3) {
			System.out.println(s3);

		}
	}

}
