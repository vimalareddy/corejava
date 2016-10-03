package collections;

import java.util.Comparator;

public class StingDescComparator implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String s1 = (String) arg0;
		String s2 = (String) arg1;

		return s2.compareTo(s1);
	}

}
