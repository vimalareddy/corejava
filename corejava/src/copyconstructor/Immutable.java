package copyconstructor;

/**
 * Immutable class 1.you should prevent the class from getting extended-marking
 * classes final. 2.all instance variables are marked final 3.don't provide any
 * setter
 * 
 * @author VimalaMulagari
 *
 */

public final class Immutable {
	private final int ssn;
	private int val;

	public Immutable(int ssn, int val) {
		super();
		this.ssn = ssn;
		this.val = val;
	}

	public int gets() {
		return this.ssn;
	}

	public int getval() {
		return this.val;
	}

}
