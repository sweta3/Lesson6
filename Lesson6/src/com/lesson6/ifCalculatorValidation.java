package com.lesson6;
import java.util.*;

public class ifCalculatorValidation {
	
	public static void main(String[] args) {
		//input
		//promt user to specify the operation to performed 
		System.out.println("Choose Operation !");
		System.out.println("addition --1: ");
		System.out.println("subtraction --2");
		System.out.println("multiprication -- 3");
		System.out.println("devision -- 4");
		
		//declare and create an object of type Scanner
		Scanner input = new Scanner(System.in);
		
		//declare a local variable  to store the users choice
		int operations = input.nextInt(); //rerad and return 1 in value
		
		if (operations !=1 && operations != 2 && operations !=3 && operations !=4) {
			System.out.println("Check your operations number . ");
		}else {//otherwise, if operation is valid execute next statement {body}
			System.out.println("Please enter 1st number: ");
			int n1 = input.nextInt();
			
			System.out.println("Please enter the 2nd number: ");
			int n2=input.nextInt();
			
			//declare and create type of object SimpleCalculator
			SimpleCalculator myCalc= new SimpleCalculator();
			
			//use the setter method to store the value n1 to the firstNumber of instance variable
			myCalc.setFirstNumber(n1);
			//use the setter method to store the value n2 to the secondNumber of instance variable
			myCalc.setSecondNumber(n2);
			
			//process
			if (operations == 1) {
				//call add() method on the object to perform the addition
				myCalc.add();
			}else if (operations == 2) {
				//call substract() method on the object to perform the subtract
				myCalc.subtract();
			}else if (operations == 3) {
				myCalc.multiply();
			
			}else if (operations == 4) {
				myCalc.divide();
			
			}
			double res = myCalc.getResult();
			System.out.println("Result: " + res);
			
		}//end else
		
	}//end main
}//end class


