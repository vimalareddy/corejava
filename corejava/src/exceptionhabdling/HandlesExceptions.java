package exceptionhabdling;

public class HandlesExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Handling ArithmeticExceptions");
		} catch (Exception e) {
			System.out.println("generic exception");
		}
		try {
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[4]);
			try {
				Integer.parseInt("abcd");
			} catch (NumberFormatException e) {
				System.out.println("Cannot convert string to integer  " + e);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException  " + e);
		}

	}

}
