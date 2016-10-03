package strings;

public class percentageOfSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tiger Runs @$ The Speed Of 100 km/hour";
		int UpperCase = 0;
		int LowerCase = 0;
		int Digit = 0;
		int OtherCharacter = 0;
		double UCPercentage;
		double LCPercentage;
		double DPercentage;
		double OPercentage;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				LowerCase++;
			} else if (Character.isUpperCase(ch)) {
				UpperCase++;
			} else if (Character.isDigit(ch)) {
				Digit++;
			} else {
				OtherCharacter++;
			}
		}
		UCPercentage = (double) (UpperCase * 100) / s.length();
		LCPercentage = (double) (LowerCase * 100) / s.length();
		DPercentage = (double) (Digit * 100) / s.length();
		OPercentage = (double) (OtherCharacter * 100) / s.length();
		System.out.println("UpperCase letters Percentage is: " + UCPercentage);
		System.out.println("LowerCase letters Percentage is: " + LCPercentage);
		System.out.println("Digits Percentage is: " + DPercentage);
		System.out.println("Characters Percentage is: " + OPercentage);

	}

}
