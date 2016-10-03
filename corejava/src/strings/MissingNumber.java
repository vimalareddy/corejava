package strings;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 2, 3, 1 };
		int n = 5;
		int sum = 0;
		int totalSum = 0;
		int missingNum;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		totalSum = (n * (n + 1)) / 2;
		missingNum = totalSum - sum;
		System.out.println("Missing Number is: " + missingNum);

	}

}
