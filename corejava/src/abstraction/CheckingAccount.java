package abstraction;

public class CheckingAccount extends BankAccount {
	public void calInterest() {
		balance = balance * 1.01;
	}

}
