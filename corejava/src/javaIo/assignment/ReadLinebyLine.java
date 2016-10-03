package javaIo.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadLinebyLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f1 = new File(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala\\a.txt");
		FileInputStream fis = new FileInputStream(f1);
		byte content[] = new byte[(int) f1.length()];
		fis.read(content);
		String s = new String(content);
		System.out.println("file content: " + s);
	}

}
