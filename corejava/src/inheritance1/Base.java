package inheritance1;

class Base {
	Base() {
		System.out.println("Base");
	}
}

public class Alpha extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Alpha();
		new Base();
	}

}
