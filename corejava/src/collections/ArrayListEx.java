package collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(null);
		a1.add(40);
		a1.add(null);

		System.out.println(a1.size());

		System.out.println(a1.isEmpty());

		ArrayList a2 = new ArrayList();

		System.out.println(a2.isEmpty());

		ArrayListEx c = new ArrayListEx();
		System.out.println(c.findElement(a1, 70));
		System.out.println(c.findposition(a1, 70));
		System.out.println(c.findposition(a1, 40));
		System.out.println("particular position is:" + a1.get(5));

		Object d[] = a1.toArray();
		for (int i = 0; i < d.length; i++) {
			System.out.println("array element: " + d[i]);
		}

		for (int i = 0; i < a1.size(); i++) {

			if (a1.get(i) == null) {
				a1.set(i, 70);

			}
		}

		for (int i = 0; i < a1.size(); i++) {
			System.out.println("updated element is: " + a1.get(i));
		}

	}

	boolean findElement(ArrayList<Integer> a, int b) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) != null && a.get(i) == b) {
				return true;
			}
		}
		return false;
	}

	int findposition(ArrayList<Integer> a, int b) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) != null && a.get(i) == b) {
				return i;
			}
		}
		return -1;
	}

}
