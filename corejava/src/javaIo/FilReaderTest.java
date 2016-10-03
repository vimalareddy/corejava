package javaIo;

import java.io.FileReader;
import java.io.IOException;

public class FilReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			fr = new FileReader(
					"C:\\Users\\VimalaMulagari\\Desktop\\junk\\sep.txt");

			int length = 1;
			int c = fr.read();

			while (c != -1) {
				System.out.println((char) c);
				c = fr.read();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}