package InterestCalci;

import java.util.Scanner;

/**
 * Calculating  Interest based on the user input
 *
 */

public class InterestCalculator {


	public static void main(String args[]){
		int option;
		Interest interestCalc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option:\n 1.Simple Interest\n 2.Compound Interest\n");
		option=sc.nextInt();
		switch(option){
			case 1: 
					interestCalc=new SimpleInterest();
					getInput(interestCalc,sc);
					System.out.println("Interest: "+interestCalc.interest());
					break;
			case 2:
					interestCalc=new CompoundInterest();
					getInput(interestCalc,sc);
					System.out.println("Interest: "+interestCalc.interest());
					break;
			default:
					System.out.println("Wrong input");
				
		}
		
		sc.close();
	}
	
	static void getInput(Interest interestCalc,Scanner sc){
		double principal,rate_of_interest,years;
		System.out.println("Enter principal");
		principal=sc.nextDouble();
		System.out.println("Enter rate of interest");
		rate_of_interest=sc.nextDouble();
		System.out.println("Enter number of years");
		years=sc.nextDouble();
		interestCalc.principal=principal;
		interestCalc.rate_of_interest=rate_of_interest;
		interestCalc.years=years;
	}
}