package com.qa.peertasks;

import java.util.ArrayList;

public class Goldilocks {

	static ArrayList<Chair> allChairs = new ArrayList<Chair>();
	static int goldilocksWeight;
	static int acceptableTemp;

	private void initialiseChairs() {
		
		
		for(int i = 1; i <= 40; i++) {
			
			Chair tempChair = new Chair();
			tempChair.setMaxUserWeight((int) ((Math.random() * 100) + 50));
			tempChair.setTemp((int) ((Math.random() * 80) + 20));
			allChairs.add(tempChair);
			
		}

//		Chair chairOne = new Chair();
//		chairOne.setMaxUserWeight(130);
//		chairOne.setTemp(100);
//		allChairs.add(chairOne);
//
//		Chair chairTwo = new Chair();
//		chairTwo.setMaxUserWeight(60);
//		chairTwo.setTemp(30);
//		allChairs.add(chairTwo);
//		
//		Chair chairThree = new Chair();
//		chairThree.setMaxUserWeight(80);
//		chairThree.setTemp(20);
//		allChairs.add(chairThree);
//		
//		Chair chairFour = new Chair();
//		chairFour.setMaxUserWeight(110);
//		chairFour.setTemp(50);
//		allChairs.add(chairFour);
//		
//		Chair chairFive = new Chair();
//		chairFive.setMaxUserWeight(90);
//		chairFive.setTemp(65);
//		allChairs.add(chairFive);
//	
		
		
	}

	public void SetWeight(int weight) {

		goldilocksWeight = weight;

	}

	public void SetTemp(int temp) {

		acceptableTemp = temp;

	}
	
	public void CanGoldilocksEat() {
		
		initialiseChairs();
		
		int counter = 1;
		
		for(Chair temp : allChairs) {
			
			if((goldilocksWeight > temp.getMaxUserWeight()) || acceptableTemp < temp.getTemp()) {
				System.out.println("Can't sit in this chair." + " " + temp.getMaxUserWeight() + " " + temp.getTemp());
			}else {
				
			    System.out.println("Can sit in chair " + counter + " " + temp.getMaxUserWeight() + " " + temp.getTemp());
			}
			counter++;	
		}
		
	}

}
