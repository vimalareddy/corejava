package javaIo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\dec.txt");

		ps.print("hello");
		ps.println("world");
		ps.print(true);
		ps.flush();
		ps.close();

		System.out.println("hello world");
		System.err.println("this is error");
		System.out.println("hello");
		System.err.println("this is 2nd error");
		System.out.println("hello2");
		System.err.println("this is 3nd error");
		System.out.println("hello3");
		System.err.println("this is 4nd error");

	}

}
