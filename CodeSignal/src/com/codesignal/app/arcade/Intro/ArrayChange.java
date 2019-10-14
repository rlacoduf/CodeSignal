
package com.codesignal.app.arcade.Intro;

public class ArrayChange {
	int arrayChange(int[] inputArray) {
		int sum = 0;
		int n = inputArray[0] + 1;
		for (int i = 1; i < inputArray.length; i++) {
			if (n > inputArray[i]) {
				sum += n - inputArray[i];
			} else if (n <= inputArray[i]) {
				n = inputArray[i];
			}
			n++;
		}
		return sum;
	}
}
