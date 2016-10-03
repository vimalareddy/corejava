package abstraction;

//realized class
public class SuperSavingAccount extends BankAccount {
	public void calInterest() {
		balance = balance * 1.06;
		System.out.println("new balance is" + balance);
	}
}
