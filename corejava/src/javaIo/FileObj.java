package javaIo;

import java.io.File;
import java.io.IOException;

public class FileObj {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\VimalaMulagari\\Desktop\\junk\\a.text");
		System.out.println(file.exists());
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println(file.exists());
		System.out.println(file.length());
		File file2 = new File("C:\\Users\\VimalaMulagari\\Desktop\\junk\\abc");

		System.out.println(file2.exists());

		if (!file2.exists())
			file2.mkdirs();
		System.out.println(file2.exists());

		file2 = new File("C:\\Users\\VimalaMulagari\\Desktop\\junk\\abc");
		String[] files = file2.list();

		for (String s : files)
			System.out.println(s);
		File file3 = new File(file2, "b.txt");
		file3.createNewFile();
	}

}
