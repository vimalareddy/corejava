package inheritance1;

public class MethodOverloadEx {
	public int add(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public int sum(byte a, byte b) {
		return a + b;
	}

	public double sum(double a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadEx m = new MethodOverloadEx();
		System.out.println(m.add(1, 2));
		System.out.println(m.sum(1, 6, 4));
		System.out.println(m.sum(3.4, 5));
		System.out.println(m.add(5, 7));
	}

}
