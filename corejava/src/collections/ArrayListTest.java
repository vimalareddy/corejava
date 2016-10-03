package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(null);
		a1.add(40);
		a1.add(null);
		a1.add(20.5);
		a1.add(true);
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

		a1.retainAll(a12);
		System.out.println(a1);

		ArrayList<Integer> a1i = new ArrayList<Integer>();
		a1i.add(100);
		a1i.add(10);

		LinkedList<Integer> a1i1 = new LinkedList<Integer>();

		System.out.println("------------");

		// synchronized array list

	}

}
