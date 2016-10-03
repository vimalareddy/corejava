package collections;

import java.util.HashSet;

public class CollectionRetain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> a1 = new HashSet<>();
		a1.add(9);
		a1.add(10);
		a1.add(8);
		a1.add(6);
		a1.add(2);
		a1.add(7);
		System.out.println(a1.size());

		HashSet<Integer> a2 = new HashSet<>();
		a2.add(20);
		a2.add(10);
		a2.add(8);
		a2.add(5);

		System.out.println(a2.size());

		System.out.println(a1.retainAll(a2));

		System.out.println("Elements in iterator are: " + a1);
		System.out.println("Elements in iterator are: " + a2);

	}

}
