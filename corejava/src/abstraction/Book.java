package abstraction;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 new_novel = new MyBook();
		new_novel.setTitle("A tale of two cities");
		System.out.println("The title is: " + new_novel.getTitle());
	}

}

abstract class Book1 {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}

}

class MyBook extends Book1 {

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}

}