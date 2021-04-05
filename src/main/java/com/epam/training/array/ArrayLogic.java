package com.epam.training.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLogic {

	ArraySorter mySorter = new ArraySorter();
	Array sortedArray;

	// TODO: write it using binary search
	public boolean exists(Array array, int element) {

		boolean isElementExist = false;

		if (array == null) {
			throw new UnsupportedOperationException();
		} else {

			sortedArray = mySorter.sort(array);

			int elementExist = Arrays.binarySearch(array.getItems(), element);
			if (elementExist >= 0) {
				isElementExist = true;
			}
		}

		return isElementExist;
	}

	public int findMinValueOfArray(Array array) {

		sortedArray = mySorter.sort(array);
		int minValue = sortedArray.getItems()[0];

		return minValue;
	}

	public int findMaxValueOfArray(Array array) {

		sortedArray = mySorter.sort(array);
		int maxIndex = sortedArray.lenght() - 1;
		int maxValue = sortedArray.getItems()[maxIndex];

		return maxValue;
	}

	public Array findPrimeNumbers(Array array) {

		Array primeNumArray = new Array();
		List<Integer> primeNumList = new ArrayList<Integer>();
		sortedArray = mySorter.sort(array);

		if (array == null) {
			throw new UnsupportedOperationException();
		} else {

			for (int i = 0; i < sortedArray.lenght(); i++) {
				if (sortedArray.getItems()[i] > 1) {
					int counter = 0;
					for (int num = sortedArray.getItems()[i]; num >= 1; num--) {
						if ((sortedArray.getItems()[i] % num) == 0) {
							counter = counter + 1;
						}
					}
					if (counter == 2) {

						primeNumList.add(sortedArray.getItems()[i]);
					}
				}
			}
		}

		int[] prime = new int[primeNumList.size()];

		for (int i = 0; i < primeNumList.size(); i++) {
			prime[i] = primeNumList.get(i);
		}

		primeNumArray.setItems(prime);

		return primeNumArray;
	}

	// TODO: add other methods here

}
