package collections;

import java.util.ArrayList;

public class AppendAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(10);
		a1.add(null);

		System.out.println(a1.size());
		a1.add(80);
		System.out.println(a1.get(a1.size() - 1));

		a1.add(3, 40);
		System.out.println(a1.get(3));

	}

}
