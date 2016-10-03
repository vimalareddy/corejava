package javaIo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw = new FileWriter(
					"C:\\Users\\VimalaMulagari\\Desktop\\junk\\sep.txt");
			fw.write(100);
			fw.write("\r\n");
			fw.write(new char[] { 'a', 'e' });
			fw.write('\t');
			fw.write("hello world");
			fw.write('\n');
			fw.write('d');
			fw.write("100");

			fw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
