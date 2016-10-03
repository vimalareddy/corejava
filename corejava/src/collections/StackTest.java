package collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<>();
		// LIFO
		st.add("Anu");
		st.add("Bharathi");
		st.add("vimala");
		st.add("raghu");
		st.add("swapna");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);

		System.out.println(st.search("vimala"));
		System.out.println(st.search("raghu"));

	}

}
