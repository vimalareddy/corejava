package strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eString = " \"core java\"";
		String double_quoteString[] = eString.split("\"");
		eString = double_quoteString[1];
		String[] splitStrings = eString.split("\\s+");
		String reverse = "";
		for (int i = 0; i < splitStrings.length; i++) {
			if (i != 0)
				reverse += " ";

			for (int j = splitStrings[i].length() - 1; j >= 0; j--) {
				reverse += splitStrings[i].charAt(j);
			}
		}

		reverse = "\"" + reverse + "\"";
		System.out.println("reverse is " + reverse);
	}

}
