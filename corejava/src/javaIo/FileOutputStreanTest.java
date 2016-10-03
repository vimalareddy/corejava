package javaIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreanTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fis = new FileOutputStream(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\oct.txt");
		String str = "this is java class.discussing on java io";
		byte[] bytes = str.getBytes();
		fis.write(bytes);
		fis.flush();
		fis.close();

		File f = new File("C:\\Users\\VimalaMulagari\\Desktop\\junk\\oct.txt");
		FileInputStream inp = new FileInputStream(f);

		int c = inp.read();
		while (c != -1) {
			System.out.println((char) c);
			c = inp.read();
		}
		byte[] byt = new byte[(int) f.length()];
		inp.read(byt);
		System.out.println(byt.toString());
		System.out.println(byt.length);
	}

}
