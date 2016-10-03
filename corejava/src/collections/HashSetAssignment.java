package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> a1 = new HashSet<>();
		a1.add(9);
		a1.add(10);
		a1.add(8);
		a1.add(6);
		a1.add(2);
		System.out.println(a1.size());
		System.out.println(a1.contains(6));
		System.out.println(a1.contains(20));
		System.out.println(a1.remove(8));
		System.out.println(a1.remove(20));

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		Iterator<Integer> ite = a1.iterator();
		System.out.println("Elements in iterator are: ");
		while (ite.hasNext()) {
			int e = ite.next();
			if (min > e) {
				min = e;
			}
			if (max < e) {
				max = e;
			}

		}

		System.out.println("max values is :" + max);
		System.out.println("min values is :" + min);

		Object[] a2 = a1.toArray();

	}

}
