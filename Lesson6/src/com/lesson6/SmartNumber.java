package com.lesson6;
/*
SmartNumber.java computes property value of number
*/

public class SmartNumber {

	
		//declare a empty constructor
		public SmartNumber() {
			System.out.println("Starting the app...");
	
	}
//compute whether the number is even. return true if the number is even, otherwise returns false
	public boolean isNumberEven (int number) {
		//declare a variable to store whether the nukmber is even
		boolean isEven = false;
		int remainder = number % 2;
		
		if(remainder ==0) {
			isEven = true;
		}
		return isEven;
	}	
}

