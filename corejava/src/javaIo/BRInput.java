package javaIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		System.out.println(name);
	}

}
