package inheritance1;

class A {
	 protected void m1() {
		System.out.println("A");
	}
}

public class B extends A {
	default void m1() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		B a = new B();
		a.m1();
	}
}