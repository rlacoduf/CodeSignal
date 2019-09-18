package com.codesignal.app.arcade.Intro;

public class AllLongestStrings {
	String[] allLongestStrings(String[] inputArray) {
		int cnt = 0;
		int maxlen = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int len = inputArray[i].length();
			if (maxlen < len) {
				cnt = 0;
				maxlen = len;
			}
			if (maxlen == len) {
				cnt++;
			}
		}

		String[] result = new String[cnt];
		int index = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int len = inputArray[i].length();
			if (len == maxlen) {
				result[index] = inputArray[i];
				index++;
			}
		}
		return result;
	}
}
