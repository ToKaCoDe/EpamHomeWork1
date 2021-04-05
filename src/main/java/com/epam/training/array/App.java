package com.epam.training.array;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] digits = { 9, 5, -4, 7, 1, -2 };

		Array myArray = new Array(digits);

		System.out.println(myArray);
		System.out.println("");

		ArrayLogic myArrayLogic = new ArrayLogic();

		System.out.println("---------Is there '-4' ?--------");
		System.out.println(myArrayLogic.exists(myArray, -4));

		System.out.println("---------MIN--------");
		System.out.println(myArrayLogic.findMinValueOfArray(myArray));

		System.out.println("---------MAX--------");
		System.out.println(myArrayLogic.findMaxValueOfArray(myArray));

		System.out.println("---------Primary numbers--------");
		System.out.println(myArrayLogic.findPrimeNumbers(myArray));
	}

}
