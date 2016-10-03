package strings;

public class ReverseStringSpaces {

	public static void main(String[] args) {

		String s = "I Am Not String";

		char[] charArray = s.toCharArray();

		for (int i = s.length() - 1, j = 0; i >= 0 && j < s.length(); i--) {
			if (charArray[j] == ' ') {
				j++;

			}

			if (s.charAt(i) == ' ') {
				continue;

			}
			charArray[j] = s.charAt(i);
			j++;

		}
		System.out.println(charArray);

	}
}
