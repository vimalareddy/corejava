package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(2);
		lhs.add(4);
		lhs.add(5);
		lhs.add(8);
		lhs.add(9);
		System.out.println(lhs.size());
		System.out.println(lhs.remove(9));

		HashSet<Integer> a1 = new HashSet<>();
		a1.add(9);
		a1.add(10);
		a1.add(8);
		a1.add(6);
		a1.add(2);

		lhs.addAll(a1);

		Iterator<Integer> ite = lhs.iterator();
		System.out.println("Elements in iterator are: ");
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
