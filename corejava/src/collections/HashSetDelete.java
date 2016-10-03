package collections;

import java.util.HashSet;

public class HashSetDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> a1 = new HashSet<>();
		a1.add(9);
		a1.add(10);
		a1.add(8);
		a1.add(6);
		a1.add(2);
		System.out.println(a1.size());

		a1.clear();

		System.out.println(a1.size());
	}

}
