package javaIo.assignment;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileStore {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala\\1.txt");
		f.createNewFile();
		FileReader fr = new FileReader(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala\\1.txt");
		int a = fr.read();
		while (a != -1) {
			System.out.println((char) a);
			a = fr.read();
		}

	}

}
