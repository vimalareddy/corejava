package exceptionhabdling;

public class MultipleatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10, b = 4;
			int c = a + b;
			int d = c / 0;

		} catch (ArithmeticException e) {
			System.out.println("cannot devide by zero");
		} catch (RuntimeException e) {
			System.out.println("run time exception");
		} catch (Exception ex) {
			System.out.println("generic exception");
		}

	}
}
