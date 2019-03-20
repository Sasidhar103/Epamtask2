package Calculator;

import java.util.Scanner;
/**
 * This is the basic Caluculator By taking Sample test cases 
 *
 */
public class Calculator {
	static int val1,val2;
	static Scanner sc;
	public static void main(String args[]){
		
		int option;
		
		additionTestCases();
		subtractionTestCases();
		multiplicationTestCases();
		divisionTestCases();
		
	
	}
	static void getInput(){
		System.out.println("Enter two values to Check operations");
		val1=sc.nextInt();
		val2=sc.nextInt();
	}
	
	static void additionTestCases(){
		//Test Case 1:
		Addition addition=new Addition(1,1);
		if(addition.add()==2)
			System.out.println("Correct output for Addition of "+1+" and "+1);
		else
			System.out.println("Wrong output for Addition of "+1+" and "+1);
		
		// Test Case 2
		addition=new Addition(5,-2);
		if(addition.add()==3)
			System.out.println("Correct output for  Addition of "+(5)+" and "+-2);
		else
			System.out.println("Wrong output for  Addition of "+(5)+" and "+-2);
		
		//case 3
		addition=new Addition(10,14);
		if(addition.add()==24)
			System.out.println("Correct output for  Addition of "+val1+" and "+val2);
		else
			System.out.println("Wrong output for  Addition of "+val1+" and "+val2);
		
	}
	
	
	static void subtractionTestCases(){
		//Test Case 1:
		Subtraction subtract=new Subtraction(1,1);
		if(subtract.sub()==0)
			System.out.println("Correct output for Subtraction of "+1+" and "+1);
		else
			System.out.println("Wrong output for  Subtraction of "+1+" and "+1);
		
		// Test Case 2
		subtract=new Subtraction(5,-2);
		if(subtract.sub()==7)
			System.out.println("Correct output for  Subtraction of "+(5)+" and "+-2);
		else
			System.out.println("Wrong output for   Subtraction of "+(5)+" and "+-2);
		
		//case 3
		subtract=new Subtraction(10,14);
		if(subtract.sub()==-4)
			System.out.println("Correct output for   Subtraction of "+val1+" and "+val2);
		else
			System.out.println("Wrong output for   Subtraction of "+val1+" and "+val2);
		
	}
	static void multiplicationTestCases(){
		//case 1:
		Multiplication multiplication=new Multiplication(1,0);
		if(multiplication.multiply()==0)
			System.out.println("Correct output for Multiplication of "+1+" and "+0);
		else
			System.out.println("wrong output for Multiplication of "+1+" and "+0);
		
		//case 2
		multiplication=new Multiplication(5,0);
		if(multiplication.multiply()==0)
			System.out.println("Correct output for Multiplication of "+5+" and "+0);
		else
			System.out.println("Wrong output for Multiplication of "+5+" and "+0);
		
		//case 3
		multiplication=new Multiplication(7,3);
		if(multiplication.multiply()==21)
			System.out.println("Correct output for Multiplication of "+7+" and "+3);
		else
			System.out.println("Wrong output for Multiplication of "+7+" and "+3);
	}
	
	static void divisionTestCases(){
		//case 1
		Division division=new Division(5,0);
		try{
			division.divide();
			System.out.println("Wrong output for division of "+5+" and "+0);
		}
		catch(ArithmeticException e){
			System.out.println("Correct output for division of "+5+" and "+0);
		}
		
		//case 2
		
		division=new Division(10,5);
		if(division.divide()==2)
			System.out.println("Correct output for division of "+10+" and "+5);
		else
			System.out.println("Wrong output for division of "+10+" and "+5);
	}
}