package exceptionhabdling;

public class TryReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryReturn tr = new TryReturn();
		int a[] = { 5, 6, 7, 8, 9 };
		System.out.println(tr.getindexvalue(a, 3));
		System.out.println(tr.getindexvalue1(a, 3));
	}

	int getindexvalue(int a[], int i) {
		try {
			return a[i];
		} catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		} finally {
			return 10;
		}
	}

	int getindexvalue1(int a[], int i) {
		try {
			return a[i];
		} finally {
			return 10;
		}
	}

}
