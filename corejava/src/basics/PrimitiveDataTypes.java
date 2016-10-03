package basics;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		int c = i.intValue();
		System.out.println(c);
		System.out.println("min vlaue is " + Integer.MIN_VALUE);
		System.out.println("max valaue is " + Integer.MAX_VALUE);

		String s = "1234.52";
		double d = Double.parseDouble(s);
		System.out.println(d);

		String s1 = "abc";
		int radix = Integer.parseInt(s1, 27);
		System.out.println(radix);

		boolean b = false;
		Boolean b1 = new Boolean(b);
		System.out.println(b1.booleanValue());

		String s2 = "true";
		Boolean b2 = Boolean.parseBoolean(s2);
		System.out.println(b2.booleanValue());

		int n = 10;
		System.out.println(n + " in binarny is: " + Integer.toBinaryString(n));
		System.out.println(n + " in octal is: " + Integer.toOctalString(n));
		System.out.println(n + " in hexadecimal is: " + Integer.toHexString(n));
	}

}
