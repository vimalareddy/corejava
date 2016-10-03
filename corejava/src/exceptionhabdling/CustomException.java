package exceptionhabdling;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			printString(null);
		} catch (StringNotNullException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	public static void printString(String message)
			throws StringNotNullException {
		if (message == null) {
			StringNotNullException ex = new StringNotNullException(
					"String is null ");
			throw ex;

		}
		System.out.println(message);
	}

}

class StringNotNullException extends Exception {

	public StringNotNullException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StringNotNullException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public StringNotNullException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StringNotNullException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StringNotNullException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
