package exceptionhabdling;

import java.net.MalformedURLException;
import java.net.URL;

public class MalformedExceptionExample {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("htt/www.google.com/");
			System.out.println("URL is correct");
		} catch (MalformedURLException e) {
			System.out.println("The url is not well formed: " + url);
		}

	}

}
