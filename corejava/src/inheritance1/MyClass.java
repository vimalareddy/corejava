package inheritance1;

public class MyClass {
	public static void main(String[] args) {
		B3 b = new C();
		A1 a = b;

		if (a instanceof A1)
			System.out.println("A");

		if (a instanceof B3)
			System.out.println("B3");

		if (a instanceof C)
			System.out.println("C");

		if (a instanceof D)
			System.out.println("D");
	}
}

class A1 {
}

class B3 extends A1 {
}

class C extends B3 {
}

class D extends C {
}