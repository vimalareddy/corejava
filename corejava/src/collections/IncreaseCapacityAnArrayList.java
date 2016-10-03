package collections;

import java.util.ArrayList;

public class IncreaseCapacityAnArrayList {

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
		a1.ensureCapacity(10);

		a1.add(5);
		a1.add(6);
		a1.add(9);
		a1.add(8);
		a1.add(4);
		System.out.println(a1.size());

		a1.trimToSize();

		System.out.println(a1.size());

	}

}
