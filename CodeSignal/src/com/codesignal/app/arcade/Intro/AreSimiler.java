package com.codesignal.app.arcade.Intro;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class AreSimiler {
	boolean areSimilar(int[] a, int[] b) {
		if (a.toString().equals(b.toString())) {
	        return true;
	    }
	    List<Integer> c = new ArrayList<>();
	    List<Integer> d = new ArrayList<>();
	    for (int i = 0; i < a.length; i++) {
	        if (a[i]!=b[i]) {
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
	
	
	@Test
	public void test123() throws Exception {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		assertTrue(areSimilar(a, b));
	}
}
