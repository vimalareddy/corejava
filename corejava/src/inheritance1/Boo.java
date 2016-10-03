package inheritance1;

class Boo {
	Boo(String s) {
	}

	Boo() {
	}
}

class Bar extends Boo {
	Bar() {
	}

	Bar(String s) {
		super(s);
	}

	void zoo() {
		// insert code here
	}
}