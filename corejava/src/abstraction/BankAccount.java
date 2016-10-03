package abstraction;

public abstract class BankAccount {
	public String name;
	public int ssn;
	public String dob;
	public String address;
	public String email;
	public String mobile;
	public double balance;
	public static final String BANK_NAME = "WELLS";
	public static String CEO;

	public BankAccount() {

	}

	static {
		// BANK_NAME = "WELLS";
	}

	// non abstract methods--->which have method body
	public void withdraw(double amount) {
		balance = amount;
		System.out.println("withdrawn.balance is" + balance);
	}

	public void deposit(double amount) {
		balance = amount;
		System.out.println("wdeposited.balance is" + balance);
	}

	// will not have any implementation details.it will tell you funcantilty
	public abstract void calInterest();
}
