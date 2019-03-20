package Calculator;
/**
 * Subtraction of two numbers
 *
 */
public class Subtraction {
	private int number1,number2;
	
	Subtraction(){} //Empty default constructor
	
	Subtraction(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	int sub(){
		return number1-number2;
	}
}