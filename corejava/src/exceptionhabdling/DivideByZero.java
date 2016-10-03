package exceptionhabdling;

import inheritance1.Seminars1;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("You can't Divide a number by zero");
		}

		try {
			Seminars1 s = null;
			System.out.println(s.date);
		} catch (NullPointerException e) {
			System.out.println("Seminars object is null  " + e);
		}

	}

}
