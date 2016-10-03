package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<>();
		System.out.println(v.capacity());
		v.addElement("vimala");
		v.add("raghu");
		System.out.println(v.elementAt(1));
		System.out.println(v.get(1));
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		System.out.println("-------");
		Enumeration<String> e = v.elements();

		// cursor--> enumeration-- cursor which is legacy

	}

}
