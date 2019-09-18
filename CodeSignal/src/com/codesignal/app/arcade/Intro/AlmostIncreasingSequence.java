package com.codesignal.app.arcade.Intro;

/*
 * this code is Lintik's one
 * https://github.com/Lintik/CodeFights-Arcade/tree/master/Intro/Edge%20of%20the%20Ocean/almostIncreasingSequence
*/

public class AlmostIncreasingSequence {
	boolean almostIncreasingSequence(int[] s) {
		int l = s.length;
		int p = -1;
		int c = 0;

		for (int i = 1; i < l; i++)
			if (s[i - 1] >= s[i]) {
				p = i;
				c++;
			}

		if (c > 1)
			return false;
		if (c == 0)
			return true;
		if (p == l - 1 || p == 1)
			return true;
		if (s[p - 1] < s[p + 1])
			return true;
		if (s[p - 2] < s[p])
			return true;
		return false;
	}
}
