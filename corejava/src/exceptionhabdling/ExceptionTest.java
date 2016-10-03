package exceptionhabdling;

import inheritance1.Seminars1;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 10, b = 20, c = 30;

			int d = a + b;
			d = d * c;
			int e = a + b + c + d;
			int f = e / d;
			f = f * a;

			if (true)
				f = f - b;

			System.out.println("hey");
			// c = 0;
			f = f / c;// an event has occured
			/*
			 * try {
			 * 
			 * } catch (Exception ex) {
			 * System.out.println("exception occured.setting value of f to 0");
			 * f = 0; }
			 */

			a = a + b;
			c = c - a;
			System.out.println("hello");
			System.out.println(f);
			Seminars1 s = null; // null pointer exception object is not
			System.out.println(s.date); // created
		} catch (ArithmeticException e) {
			System.out.println("main exception block");
		}

		catch (RuntimeException e) {
			System.out.println("run time exception" + e.getMessage() + e);
		} catch (Exception ex) {
			System.out.println("generic exception");
		} catch (Throwable t) {
			System.out.println("throwable");
		} finally {
			// con.close();
			System.out.println("finally block");
		}

		// Date sdf =DateFormat.getInstance().parse("12-12-2000 ");

	}

}
