package copyconstructor;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boxing
		Integer aInt = new Integer(20);
		int a = 20;

		Integer bInt = Integer.valueOf(30);

		Integer cInt = a; // auto boxing
		System.out.println(cInt.toString());
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// un-boxing
		int c = aInt.intValue();
		System.out.println(c);

		int b = bInt.intValue();
		System.out.println(b);

		Boolean bl = new Boolean(true);
		boolean blp = bl.booleanValue();
		System.out.println(blp);

		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);

		String s1 = "true";
		boolean bs1 = Boolean.parseBoolean(s1);
	}

}
