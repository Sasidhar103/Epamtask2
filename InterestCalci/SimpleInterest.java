package InterestCalci;
/**
 * Calculating Simple Interest
 *
 */
public class SimpleInterest extends Interest {
	public double interest(){
		return principal*rate_of_interest*years;
	}
}