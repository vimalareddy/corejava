package exceptionhabdling;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException  " + e);
		}
	}

}
