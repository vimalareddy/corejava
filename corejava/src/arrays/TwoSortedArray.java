package arrays;

public class TwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 'a', 'b', 'c', 'd', 'e' };
		int b[] = { 'a', 'b', 'e', 'f', 'z' };
		int i = 0;
		int j = 0;
		int c = a.length - 1;
		int d = b.length - 1;
		while (i < c && j < d) {
			if (a[i] < b[j]) {
				i++;

			} else if (b[j] < a[i]) {
				j++;

			} else {
				System.out.println((char) a[i]);
				i++;
				j++;
			}

		}
	}

}
