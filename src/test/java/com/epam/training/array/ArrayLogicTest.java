package com.epam.training.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayLogicTest {

    //TODO: add tests for various scenarios

	@Test
	public void testShouldShowTrueWhenElementExist() {

		// Arrange
		int[] myArray = { 2, 3, 1 };
		Array array = new Array(myArray);
		int elemnt = 2;
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Boolean result = arrayLogic.exists(array, elemnt);

		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testShouldShowTrueWhenElementExistAndHaveNegativeElement() {

		// Arrange
		int[] myArray = { -2, -3, 1 };
		Array array = new Array(myArray);
		int elemnt = -2;
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Boolean result = arrayLogic.exists(array, elemnt);

		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testShouldShowFalseWhenElementNotExist() {

		// Arrange
		int[] myArray = { 2, 3, 1 };
		Array array = new Array(myArray);
		int elemnt = 4;
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Boolean result = arrayLogic.exists(array, elemnt);

		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void testShouldShowTrueWhenElementExistAndSizeIsOneElement() {

		// Arrange
		int[] myArray = {2};
		Array array = new Array(myArray);
		int elemnt = 2;
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Boolean result = arrayLogic.exists(array, elemnt);

		// Assert
		assertEquals(true, result);
	}
	
	@Test
	public void testShouldShowFalseWhenElementNotExistAndSizeIsOneElement() {

		// Arrange
		int[] myArray = {4};
		Array array = new Array(myArray);
		int elemnt = 2;
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Boolean result = arrayLogic.exists(array, elemnt);

		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void testShouldShowFalseWhenArrayIsEmpty() {

		// Arrange
		int[] myArray = {};
		Array array = new Array(myArray);
		int elemnt = 2;
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Boolean result = arrayLogic.exists(array, elemnt);

		// Assert
		assertEquals(false, result);
	}
	
	@Test
	public void testShouldShowMinValueOfArray() {

		// Arrange
		int[] myArray = { -2, -3, 1 };
		Array array = new Array(myArray);
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		int result = arrayLogic.findMinValueOfArray(array);

		// Assert
		assertEquals(-3, result);
	}
	
	@Test
	public void testShouldShowMaxValueOfArray() {

		// Arrange
		int[] myArray = { -2, -3, 1 };
		Array array = new Array(myArray);
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		int result = arrayLogic.findMaxValueOfArray(array);

		// Assert
		assertEquals(1, result);
	}
	
	@Test
	public void testShouldShowPrimaryWhenArrayIsSorted() {

		// Arrange
		int[] testArray = { 2, 3, 1, -7, 9, 5, 11, 12};
		Array test = new Array(testArray);
		int[] corectArray = { 2, 3, 5, 11 };
		Array corect = new Array(corectArray);
		ArrayLogic arrayLogic = new ArrayLogic();

		// Act
		Array result = arrayLogic.findPrimeNumbers(test);
		
		// Assert
		assertEquals(corect, result);
	}
	
	
}
