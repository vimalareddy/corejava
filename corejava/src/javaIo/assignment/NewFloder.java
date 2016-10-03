package javaIo.assignment;

import java.io.File;
import java.io.IOException;

public class NewFloder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala");

		System.out.println(file1.exists());

		if (!file1.exists())
			file1.mkdirs();
		System.out.println(file1.exists());

		File file4 = new File(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala\\a.txt");

		System.out.println(file1.exists());
		if (!file4.exists()) {
			try {
				file4.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File file2 = new File(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala\\b.txt");

		System.out.println(file2.exists());
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File file3 = new File(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\vimala\\c.txt");

		System.out.println(file2.exists());
		if (!file3.exists()) {
			try {
				file3.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		String[] files = file1.list();
		for (String s : files)
			System.out.println(s);

		File[] fileArray = file1.listFiles();

		for (File f : fileArray)
			System.out.println(f.getAbsolutePath());

	}

}
