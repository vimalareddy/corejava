package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetRetain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		ls.add(3);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		ls.add(2);
		System.out.println(ls.size());

		LinkedHashSet<Integer> ls1 = new LinkedHashSet<>();
		ls1.add(7);
		ls1.add(6);
		ls1.add(9);
		ls1.add(5);
		ls1.add(2);
		System.out.println(ls1.size());

		System.out.println(ls.retainAll(ls1));
		System.out.println("Elements in iterator are: " + ls);
		System.out.println("Elements in iterator are: " + ls1);
	}

}
