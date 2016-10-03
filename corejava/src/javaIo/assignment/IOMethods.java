package javaIo.assignment;

import java.io.File;
import java.io.IOException;

public class IOMethods {

	public static void main(String[] args) {
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
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());

		File file2 = new File("C:\\Users\\VimalaMulagari\\Desktop\\junk");
		String[] files = file2.list();

		for (String s : files)
			System.out.println(s);
		System.out.println(file.delete());
		System.out.println(file.exists());
	}

}
