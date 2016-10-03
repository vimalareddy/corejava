package javaIo;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("hello" + name);
		System.out.println("enter age:");
		int age = sc.nextInt();
		System.out.println("age is " + age);
	}

}
