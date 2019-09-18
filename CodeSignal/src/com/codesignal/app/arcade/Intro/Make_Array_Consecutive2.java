package com.codesignal.app.arcade.Intro;

public class Make_Array_Consecutive2 {
	int makeArrayConsecutive2(int[] statues) {
		int cnt = 0;
		int[] sortStatues = statues;
		
		for (int j = 0; j < sortStatues.length; j++) {
			for (int i = 0; i < statues.length; i++) {
				if (i + 1 != statues.length) {
					int num1 = statues[i];
					int num2 = statues[i + 1];
					if (num1 > num2) {
						sortStatues[i + 1] = num1;
						sortStatues[i] = num2;
					}
				}
			}
		}
		
		for (int i = 0; i < sortStatues.length; i++) {
			if (i + 1 != sortStatues.length) {
				int num1 = sortStatues[i];
				int num2 = sortStatues[i + 1];
				if (num1 + 1 != num2) {
					cnt += num2 - num1 - 1;
				}
			}
		}

		return cnt;
	}
}
