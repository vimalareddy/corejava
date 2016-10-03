package strings;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple,banana,grapes,apple,grapes";
		String[] sArray = s.split("\\,");
		int apple_count = 0;
		int banana_count = 0;
		int grape_count = 0;

		for (int j = 0; j < sArray.length; j++) {
			if (sArray[j].equals("apple")){
				apple_count++;
			} else if(sArray[j].equals("banana")){
				banana_count++;
			} else if (sArray[j].equals("grapes")){
				grape_count++;
			}
		}
		
		System.out.println("Apple count is:"+apple_count);
		System.out.println("banana count is:"+banana_count);
		System.out.println("grape count is:"+grape_count);

	}
}
