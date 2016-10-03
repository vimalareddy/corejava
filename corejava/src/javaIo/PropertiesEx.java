package javaIo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		prop.load(new FileReader("config.properties"));
		System.out.println(prop.getProperty("dbuser"));
	}

}
