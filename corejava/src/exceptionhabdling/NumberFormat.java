package exceptionhabdling;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer.parseInt("abcd");
		} catch (NumberFormatException e) {
			System.out.println("Cannot convert string to integer  " + e);
		}
	}

}
