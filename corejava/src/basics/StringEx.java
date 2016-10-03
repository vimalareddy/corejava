package basics;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "core java";

		System.out.println(s.indexOf(' '));

		char b[] = s.toCharArray();
		char a[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.println(i);

			}
			a[i] = s.charAt(i);
			// System.out.println(s.charAt(i));
		}

		System.out.println(a);
		System.out.println(b);
		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.println(s.charAt(i));
		}
		int c[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int j = 0; j < c.length; j++) {

			sum = sum + c[j];

		}
		System.out.println(sum);

	}

}
