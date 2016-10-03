package strings;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "alala";
		
		int a_count = 0;
		int l_count = 0;
		

		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j)=='a'){
				a_count++;
			} else if (s.charAt(j)=='l'){
				l_count++;
			
			}
		}
		
		System.out.println("A count is:"+a_count);
		System.out.println("l count is:"+l_count);

	}

}
