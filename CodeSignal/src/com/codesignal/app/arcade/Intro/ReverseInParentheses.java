package com.codesignal.app.arcade.Intro;

//pda16's Solution
public class ReverseInParentheses {
	String reverseInParentheses(String inputString) {
		StringBuilder str = new StringBuilder(inputString);
	    int start, end;
	    while(str.indexOf("(") != -1){
	        start = str.lastIndexOf("(");
	        end = str.indexOf(")", start);
	        str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
	    }
	    return str.toString();
	}
}
