package exceptionhabdling;

public class StringException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s = "sweety";
			System.out.println(s.charAt(7));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("The String IndexOutOfBoundsException " + e);

		}

	}

}
