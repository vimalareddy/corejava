package collections;

import java.util.HashSet;
import java.util.Iterator;

public class CopyElementsHashSettoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> a1 = new HashSet<>();
		a1.add(9);
		a1.add(10);
		a1.add(8);
		a1.add(6);
		a1.add(2);

		int i = 0;

		int a[] = new int[a1.size()];

		Iterator<Integer> ite = a1.iterator();

		System.out.println("Elements in iterator are: ");

		while (ite.hasNext()) {
			a[i] = ite.next();
			i++;
		}

		for (int j = 0; j < a.length; j++) {

			System.out.println(a[j]);
		}
	}

}
