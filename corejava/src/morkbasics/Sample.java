package morkbasics;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is vinala na na na na";
		int count = 0;
		int index = 0;
		while (index != -1) {
			index = s.indexOf("na", index);
			if (index != -1) {
				count++;
				index++;
			}
		}

		System.out.println("count is: " + count);
		getNumberofWords(s);
	}

	private static void getNumberofWords(String s) {
		// TODO Auto-generated method stub
		System.out.println(s.length());
	}

}
