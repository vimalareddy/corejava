package collections;

import java.util.HashSet;

public class HashsetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no duplicates , no insertion order
		HashSet<String> a1si = new HashSet<>();
		a1si.add("mani");
		a1si.add("kranthi");
		a1si.add("divya");
		a1si.add("balaji");
		a1si.add("raghu");
		a1si.add("vimala");
		System.out.println(a1si);

		a1si.add("vimala");
		System.out.println(a1si);

	}

}
