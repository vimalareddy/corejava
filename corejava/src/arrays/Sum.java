package arrays;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(a.length);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println(sum);

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				System.out.println("even number" + a[i]);
			} else {
				System.out.println("odd number" + a[i]);
			}

		}
		int n = 11;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("the prime number:" + n);

		} else {
			System.out.println("the  number is not prime:" + n);
		}
	}

}
