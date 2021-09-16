package com.xworkz.methods;

public class OlampycsMedals {
	public static int olampycsMedals(int gold, int silver, int bronze) {
		int totalMedals = gold + silver + bronze;
		return totalMedals;
	}

	public static void main(String[] args) {
		int gold = 1;
		int silver = 2;
		int bronze = 4;
		int totalNoOfMedals = OlampycsMedals.olampycsMedals(gold, silver, bronze);
		System.out.println("total number of medals " + totalNoOfMedals);
	}
}
