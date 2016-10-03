package inheritance1;

public class RaghuEx {

	int a;

	public RaghuEx() {
	}

	public RaghuEx(int a) {
		super();
		this.a = a;
	}

}

class RaghuChild extends RaghuEx {

	int b;

	public RaghuChild(int b) {
		super(20);
		this.b = b;
	}

	public static void main(String[] args) {
		RaghuChild rc = new RaghuChild(10);
		System.out.println(rc.b);
		System.out.println(rc.a);

	}
}
