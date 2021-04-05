package com.epam.training.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraySorterTest {

	// TODO: uncomment test when junit dependency is added
	@Test
	public void testSortShouldSortWhenPositiveNumbers() {

		// Arrange
		int[] positiveArray = { 2, 3, 1 };
		Array pos = new Array(positiveArray);
		int[] corectArray = { 1, 2, 3 };
		Array corect = new Array(corectArray);
		ArraySorter arraySorter = new ArraySorter();

		// Act
		Array result = arraySorter.sort(pos);

		// Assert
		assertEquals(corect, result);
	}

	@Test
	public void testSortShouldSortWhenNegativeNumbers() {

		// Arrange
		int[] positiveArray = { -2, -3, -1 };
		Array pos = new Array(positiveArray);
		int[] corectArray = { -3, -2, -1 };
		Array corect = new Array(corectArray);
		ArraySorter arraySorter = new ArraySorter();

		// Act
		Array result = arraySorter.sort(pos);

		// Assert
		assertEquals(corect, result);
	}
	
	@Test
	public void testSortShouldSortWhenDifferentNumbers() {

		// Arrange
		int[] positiveArray = { 0, 4, -1 };
		Array pos = new Array(positiveArray);
		int[] corectArray = { -1, 0, 4 };
		Array corect = new Array(corectArray);
		ArraySorter arraySorter = new ArraySorter();

		// Act
		Array result = arraySorter.sort(pos);

		// Assert
		assertEquals(corect, result);
	}
}
