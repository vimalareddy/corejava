package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetCopyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> s = new LinkedHashSet<>();
		s.add("vimala");
		s.add("Raghu");
		s.add("Swapna");
		s.add("Raghu");
		s.add("Sindhu");
		s.add("Sinu");
		System.out.println(s.size());

		Object c[] = s.toArray();

		int i = 0;
		String a[] = new String[s.size()];
		Iterator<String> ite = s.iterator();
		while (ite.hasNext()) {
			a[i] = ite.next();
			i++;

		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		s.remove("Raghu");
		System.out.println(s.size());

	}

}
