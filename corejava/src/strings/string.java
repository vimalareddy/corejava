package strings;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Core java";
		System.out.println("string length is " + s.length());
		String s1 = " Net Logic";
		int beginIndex =3;
		System.out.println(s1.substring(beginIndex));
		System.out.println(s1.substring(1, 4));
		String s2 = "Core java Class ";
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('a'));
		System.out.println(s.compareTo(s2));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s));
		System.out.println(s1.startsWith(" Net"));
		System.out.println(s2.startsWith(s));
		System.out.println(s.endsWith(s2));
		System.out.println(s.format(s2, null));
		System.out.println(s.format(s1, args));
	}
	

}
