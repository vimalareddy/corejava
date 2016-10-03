package copyconstructor;

/**
 * strictfp: to have same precision across various platforms for floating point
 * variables can be applied on class , method , interface cannot be applied on
 * abstract method ,variables,constructor.
 * 
 * @author VimalaMulagari
 *
 */
public strictfp class PrecisionClass {
	public static void main(String[] args) {
		double d1 = 7.8989933399;
		double d2 = 89.76434522352254;
		double d3 = d1 * d2;
		System.out.println(d3);

	}
}
