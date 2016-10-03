package inheritance1;

public class ExamQsn {
	static int j;

	static void methodA(int i) {
		boolean b;
		do {
			b = i < 10 | methodB(4);
			b = i < 10 || methodB(8);

		} while (!b);
	}

	static boolean methodB(int i) {
		j += i;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodA(0);
		System.out.println("j =" + j);
	}

}
