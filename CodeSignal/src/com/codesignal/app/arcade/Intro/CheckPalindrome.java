package com.codesignal.app.arcade.Intro;

public class CheckPalindrome {
	boolean checkPalindrome(String inputString) {
		char[] str = inputString.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (i < str.length - 1 - i && str[i] != str[str.length - 1 - i]) {
				return false;
			} else if (i >= str.length - 1 - i) {
				return true;
			}
		}
		return true;
	}
}
