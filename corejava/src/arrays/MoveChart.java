package arrays;

import java.util.Arrays;

public class MoveChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 0, 3, 0, 4, 0, 5, 1 };
		int i = 0;
		int j = a.length - 1;

		while (i < j) {

			while (i < j) {
				if (a[i] == 0) {
					break;
				}
				i++;

			}

			while (i < j) {
				if (a[j] != 0) {
					break;
				}
				j--;

			}

			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;

			}
		}
		System.out.println(Arrays.toString(a));

	}
}