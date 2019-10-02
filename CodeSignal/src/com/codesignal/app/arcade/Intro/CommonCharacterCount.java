package com.codesignal.app.arcade.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacterCount {
	int commonCharacterCount(String s1, String s2) {
		int result = 0;
		List<Character> str1 = new ArrayList<Character>();
		List<Character> str2 = new ArrayList<Character>();
		char[] st1 = s1.toCharArray();
		char[] st2 = s2.toCharArray();
		Arrays.parallelSort(st1);
		Arrays.parallelSort(st2);
		for (int i = 0; i < st1.length; i++) {
			str1.add(st1[i]);
		}
		for (int i = 0; i < st2.length; i++) {
			str2.add(st2[i]);
		}
		for (int i = 0; i < str1.size(); i++) {
			for (int j = 0; j < str2.size(); j++) {
				if (str1.get(i)==str2.get(j)) {
					result++;
					str2.remove(j);
					if (str2.size()==0) {
						return result;
					}
					break;
				}
			}
		}
		return result;
	}
	
	//this is Copy of user 'viet_tran'
	int commonCharacterCount1(String s1, String s2) {
	    int[] a = new int[26], 
	        b = new int[26];
	    for (char c: s1.toCharArray())
	        a[c - 'a']++; // for count char num
	    for (char c: s2.toCharArray())
	        b[c - 'a']++;
	    int s = 0;
	    for (int i = 0; i < 26; ++i) 
	        s +=Math.min(a[i],b[i]); 
	    //ex i = 1 -> a[1],b[1]-> 'b' letter num
	    //if String 's1' and 's2' has letters 'b', a[1]=2, b[1]=0
	    // -> result s = 0 cuz letter 'b' is not concurrectly exist LOL
	    return s;
	        
	}
}
