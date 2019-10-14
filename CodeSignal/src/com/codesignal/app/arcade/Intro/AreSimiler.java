package com.codesignal.app.arcade.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AreSimiler {
	boolean areSimilar(int[] a, int[] b) {
		if (Arrays.equals(a, b)) {
			return true;
		}
		List<Integer> c = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				c.add(a[i]);
				d.add(b[i]);
			}
		}
		Collections.reverse(d);
		if (c.size() == 2 && (c.toString().equals(d.toString()))) {
			return true;
		}
		return false;
	}

	// bandorthild's Solution
	boolean areSimilar1(int[] a, int[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				sum++;
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b) && sum < 3;
	}

}
