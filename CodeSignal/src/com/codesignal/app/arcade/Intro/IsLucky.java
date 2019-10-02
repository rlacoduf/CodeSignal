package com.codesignal.app.arcade.Intro;

public class IsLucky {
	static boolean isLucky(int n) {
		int tmp = n;
		int cnt = 0;
		while (tmp != 0) {
			cnt++;
			tmp /= 10;
		}
		int num1 = 0, num2 = 0;
		num1 = (int) (n / Math.pow(10, cnt / 2));
		num2 = (int) (n % Math.pow(10, cnt / 2));

		int sum1 = 0, sum2 = 0;
		while (num1 != 0) {
			sum1 += num1 % 10;
			sum2 += num2 % 10;

			num1 = num1 / 10;
			num2 = num2 / 10;
		}
		return sum1 == sum2;
	}

	// this is user jocke93's answer
	boolean isLucky1(int n) {
		String s = n + "";
		int sum = 0;

		for (int i = 0; i < s.length() / 2; i++)
			sum += (s.charAt(i) - s.charAt(s.length() - 1 - i));
		
		return sum == 0;
	}
}
