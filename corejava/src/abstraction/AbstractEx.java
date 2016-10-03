package abstraction;

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Honda();
		b.run();
	}

}

abstract class Bike {
	abstract void run();
}

class Honda extends Bike {
	void run() {
		System.out.println("Honda bike is running");
	}

}