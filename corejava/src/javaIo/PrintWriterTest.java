package javaIo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\nov.text");
		int i = 100;

		pw.print(true);
		pw.print("hello world");
		pw.print(20.5);

		pw.flush();
		pw.close();

	}

}
