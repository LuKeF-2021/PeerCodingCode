package com.qa.feb15;

public class Doggo {

	private int dogPlace;
	
	String placing;
	
	// 51st 52nd 53rd
	
	//have all places and get rid of your doggo place
	
	public void positions(int doggoPlace) {
		
		int lastDigit; 
		
		for	(int i = 1; i <= 100; i++) {
			
			
			lastDigit = i % 10;
			
			if (i == doggoPlace) {
				
			} else if (i >= 11 && i <=13) {
				System.out.println(i + "th");
			} else {
			
			System.out.println(i + this.appender(lastDigit));
			}
		}
		
	}
	
	
	private String appender(int input) {
		String ending = "";
		
		switch(input){
		case 1 : 
			 ending = "st";
			 break;
		case 2 : 
			 ending = "nd";
			 break;	
		case 3 : 
			 ending = "rd";
			 break;	
		case 4,5,6,7,8,9,0 : 
			 ending = "th";
			 break;
		}
		
		return ending;
		
		
		
		
	}
	
	
}
