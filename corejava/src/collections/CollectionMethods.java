package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(null);
		a1.add(40);
		System.out.println(a1.size());

		ArrayList a12 = new ArrayList<>();
		a12.add(100);
		a12.add(200);

		a1.addAll(a12);
		a12.add(300);

		System.out.println(a1.contains(100));
		System.out.println(a1.containsAll(a12));

		System.out.println(a1.size());
		System.out.println(a1);
		a1.remove(new Integer(100));
		System.out.println(a1);
		System.out.println(a1.isEmpty());

		a1.retainAll(a12);
		System.out.println(a1);

		ArrayList<Integer> a1i = new ArrayList<Integer>();
		a1i.add(100);
		a1i.add(10);

		Object d[] = a1.toArray();
		for (int i = 0; i < d.length; i++) {
			System.out.println("array element: " + d[i]);
		}
		Iterator<Integer> ite = a1.iterator();
		System.out.println("Elements in iterator are: ");
		while (ite.hasNext()) {

			System.out.println(ite.next());
		}

		System.out.println(a1.removeAll(a1));

		a1.clear();
		System.out.println(a1.size());

	}

}
