package InterestCalci;
/**
 * Calculating compound Interest
 *
 */
public class CompoundInterest extends Interest {
	public double interest(){
		return principal*Math.pow((1+rate_of_interest), years)-principal;
	}
}