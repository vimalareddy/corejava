package inheritance1;

class A2 {
	final public int GetResult(int a, int b) {
		return 0;
	}
}

class B2 extends A2 {
	public int GetResult(int a, int b) {
		return 1;
	}
}

public class TestGetResult {
	public static void main(String args[]) {
		B2 b = new B2();
		System.out.println("x = " + b.GetResult(0, 1));
	}
}
