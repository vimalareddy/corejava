package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sorting on array list
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("vimala");
		a1.add("raghu");
		a1.add("radhi");
		a1.add("deepa");
		a1.add("swetha");

		System.out.println(a1);

		Collections.sort(a1);// defailte sorted order
		System.out.println(a1);

		Collections.sort(a1, new StingDescComparator());
		System.out.println(a1);
	}

}
