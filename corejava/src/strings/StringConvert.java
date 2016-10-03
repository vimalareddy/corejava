package strings;

public class StringConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int num = 0;
		boolean isNeg = false;
		String str = " ";

		if (str.charAt(0) == '-') {
			isNeg = true;
			i = 1;
		}

		while (i < str.length()) {
			num *= 10;
			num += str.charAt(i++) - '0';
		}

		if (isNeg) {
			num = -num;

		}
		System.out.println(num);
	}

}
