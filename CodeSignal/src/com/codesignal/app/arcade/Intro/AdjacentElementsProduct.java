package com.codesignal.app.arcade.Intro;

public class AdjacentElementsProduct {
	int adjacentElementsProduct(int[] inputArray) {
		int result = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (i + 1 == inputArray.length) {
				break;
			}
			int temp = inputArray[i + 1] * inputArray[i];
			if (result < temp || i == 0) {
				result = temp;
			}
		}
		return result;
	}
}
