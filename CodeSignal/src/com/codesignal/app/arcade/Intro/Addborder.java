package com.codesignal.app.arcade.Intro;

public class Addborder {
	String[] addBorder(String[] picture) {
		int lth = picture.length;
		String[] result = new String[lth + 2];

		StringBuilder str = new StringBuilder();
		for (int j = 0; j < picture[0].length()+2; j++) {
			str.append("*");
		}

		for (int i = 0; i < lth + 2; i++) {
			if (i == 0 || i == lth + 1) {
				result[i] = str.toString();
			} else {
				result[i] = "*"+picture[i-1]+"*";
			}
		}
		return result;
	}
}
