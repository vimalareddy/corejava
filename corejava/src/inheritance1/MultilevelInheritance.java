package inheritance1;

class Level1 {
	int a;

	public Level1(int a) {
		super();
		this.a = a;
	}

}

class Level2 extends Level1 {
	int b;

	public Level2(int a, int b) {
		super(a);
		this.b = b;
	}

}

class Level3 extends Level2 {
	int c;

	public Level3(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Level3 l3 = new Level3(2, 4, 5);
		System.out.println("a=" + l3.a + " b=" + l3.b + " c=" + l3.c);
	}

}
