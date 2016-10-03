package abstraction;

public abstract class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new SBI();
		System.out.println("SBI bank interest is " + b.getRateOfInterest());

		Bank b1 = new ICICI();
		System.out.println("ICICI bank interest is " + b1.getRateOfInterest());
	}

	abstract double getRateOfInterest();
}

class SBI extends Bank {
	double getRateOfInterest() {
		double i = 0.5;
		return i;
	}
}

class ICICI extends Bank {
	double getRateOfInterest() {
		double d = 0.8;
		return d;
	}
}