package com.lesson6;
import java.util.*;
/*
SmartNumberApp.java uses the instantiable class to determine the property of number entered by use
 */

public class SmartNumberApp {

	public static void main(String[] args) {
		//declare a a local variable to store user input
		int n;
		
		//declare a boolean variable to store the property of a number 
		boolean property;
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter an integer number: ");
		n = myScanner.nextInt();
		
		//create an object of type SmartNumber
		SmartNumber number = new SmartNumber();
		
		property = number.isNumberEven(n);
		System.out.println("is "+ n + " even? "+ property);
	}

}
