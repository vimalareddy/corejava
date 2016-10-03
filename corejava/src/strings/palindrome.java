package strings;

public class palindrome {

	public static void main(String[] args) {
		String s = "madam";

		palindrome.isPalindrome(s);
		s = "malayalam";
		palindrome.isPalindrome(s);
		s = "class";
		palindrome.isPalindrome(s);

		s = "remote";
		palindrome.isPalindrome(s);

	}

	public static void isPalindrome(String s) {
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("this is not palindrome: " + s);
				return;

			}
		}
		System.out.println("this is palindrome: " + s);
	}
}
