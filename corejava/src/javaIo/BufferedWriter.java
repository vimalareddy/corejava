package javaIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\buf.txt");
		// FileWriter fw =new FileWriter("D:\\junk\\buf.txt");
		java.io.BufferedWriter bw = new java.io.BufferedWriter(fw);
		bw.write("hello world");
		bw.newLine();
		bw.write("100");

		bw.flush();
		bw.close();

		BufferedReader rdr = new BufferedReader(new FileReader(
				"C:\\Users\\VimalaMulagari\\Desktop\\junk\\buf.txt"));
		String s = rdr.readLine();
		while (s != null) {
			System.out.println(s);
			s = rdr.readLine();
		}
	}

}
