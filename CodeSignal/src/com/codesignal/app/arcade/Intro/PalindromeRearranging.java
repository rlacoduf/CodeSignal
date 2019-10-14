package com.codesignal.app.arcade.Intro;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeRearranging {
	boolean palindromeRearranging(String inputString) {
		char[] str = inputString.toCharArray();
		ArrayList<Character> checklist = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			checklist.add(str[i]);
		}
		Collections.sort(checklist);
		for (int i = 0; i < checklist.size()-1; i++) {
			if (checklist.get(i).equals(checklist.get(i+1))) {
				checklist.remove(i);
				checklist.remove(i+1);
				i--;
				if (checklist.size()<=1) {
					return true;
				}
			}
		}
		return false;
	}
}
