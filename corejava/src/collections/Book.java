package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Book {

	String id;
	String name;

	public Book(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		HashSet<Book> b1 = new HashSet<>();
		Book java = new Book("2", "corejava");
		Book sql = new Book("3", "sql");
		Book dbms = new Book("4", "dbms");
		b1.add(java);
		b1.add(sql);

		System.out.println(b1.contains(java));
		System.out.println(b1.contains(dbms));
		System.out.println(b1.remove(sql));

		Iterator<Book> ite = b1.iterator();

		System.out.println("Elements in iterator are: ");

		while (ite.hasNext()) {
			Book b = ite.next();
			System.out.println(b.id + " : " + b.name);
		}

	}

}
