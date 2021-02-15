package com.qa.peertasks;

public class ReverseFactorial {

	private float currentNum;
	private float divisionResult;
		
	public void IsNumFactorial(int numToCheck) {
		
		currentNum = (float) numToCheck;
		divisionResult = (float) (currentNum/1);
		int counter = 1;
		
		if(numToCheck == 0) {
			System.out.println("1!");
			return;
		}
		
		while(divisionResult > 1.00f) {
			
			currentNum = currentNum/counter;
			counter ++;
			System.out.println(currentNum + "/" + counter);
			divisionResult = (float) (currentNum/counter);
			
		}
		
		if(divisionResult == 1.00f) {
			System.out.println(counter + "!");
		}else {
			System.out.println("The inputted number is not a factorial");
		}
		
	}
	
}
