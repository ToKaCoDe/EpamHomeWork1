package com.epam.training.array;

import java.util.Arrays;

public class ArraySorter {

	public Array sort(Array array) {

		if (array == null) {
			throw new UnsupportedOperationException();
		} else {

			Arrays.sort(array.getItems());
		}

		return array;
	}
}
