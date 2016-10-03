package strings;

public class ContinuousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 12, 5, 31, 13, 21, 8 };
		int total = 49;
		int sum = array[0];
		int index = 0;
		int i, j;
		for (i = 1; i < array.length; i++) {
			sum = sum + array[i];
			while (sum > total && index <= i - 1) {
				sum = sum - array[index];
				index++;
			}
			if (sum == total) {
				System.out.print("continuous SubArray is: ");
				for (j = index; j <= i; j++) {
					System.out.print(array[j] + " ");

				}

			}

		}
		System.out.println(total);

	}
}