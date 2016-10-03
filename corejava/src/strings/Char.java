package strings;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Vimala";
		System.out.println(s.charAt(2));
		System.out.println(s.replaceFirst("Vi", "A"));
		for (int i = s.length() - 1; i >= 0; i--)
			System.out.println(s.charAt(i));
		String s1 = " this is Raghu";
		StringBuffer s2 = new StringBuffer();
		String[] sb = s1.split(" ");
		for (int i = 0; i < sb.length; i++) {
			s2.append(sb[i]);
			
		}
		System.out.println(s2.toString());
	}

}
