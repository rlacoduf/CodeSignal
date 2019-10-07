package com.codesignal.app.arcade.Intro;

public class AlternatingSums {
	int[] alternatingSums(int[] a) {
		int[] result = new int[2];
		int lth = a.length;
		for (int i = 0; i < lth; i++) {
			if (i % 2 == 1) {
				result[1] += a[i];
			} else {
				result[0] += a[i];
			}
		}
		return result;
	}

	// jocke93's solution
	int[] alternatingSums1(int[] a) {
		int[] niz = new int[2];
		for (int i = 0; i < a.length; i++)
			niz[i % 2] += a[i];
		
		return niz;
	}
}
