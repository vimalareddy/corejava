package strings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "avaj";

		Anagrams.isAnagarm(s1, s2);
	}

	public static void isAnagarm(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println("these are not Anagarams: " + s1 + " " + s2);
			return;
		}
		char[] s1c = s1.toCharArray();
		Arrays.sort(s1c);

		char[] s2c = s2.toCharArray();
		Arrays.sort(s2c);

		String s3 = new String(s1c);

		String s4 = new String(s2c);

		if (s3.equals(s4)) {
			System.out.println("these are Anagarams: " + s1 + " " + s2);
		} else {
			System.out.println("these are not Anagarams: " + s1 + " " + s2);
		}

	}
}