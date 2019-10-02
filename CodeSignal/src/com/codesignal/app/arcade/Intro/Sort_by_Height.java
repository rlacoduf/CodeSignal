package com.codesignal.app.arcade.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sort_by_Height {
	int[] sortByHeight(int[] a) {
		int lth = a.length;
		int[] result = a;
		List<Integer> tmplist = new LinkedList<>();
		for (int i : result) {
			if (i != -1) {
				tmplist.add(i);
			}
		}
		Collections.sort(tmplist);
		for (int i = lth - 1; i > -1; i--) {
			if (tmplist.size() == 0) {
				break;
			}
			if (result[i] != -1) {
				result[i] = tmplist.get(tmplist.size() - 1);
				tmplist.remove(tmplist.size() - 1);
			}
		}
		return result;
	}

	// Solution by user 'mehdirizvi'
	int[] sortByHeight1(int[] a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : a) {
			if (i != -1) {
				list.add(i);
			}
		}
		Collections.sort(list);
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != -1) {
				a[i] = list.get(index++);
			}
		}
		return a;
	}

	// Solution by user 'bandorthild'
	int[] sortByHeight2(int[] a) {
		List<Integer> l = Arrays.stream(a).filter(i -> i != -1).sorted().boxed().collect(Collectors.toList());
		List<Integer> m = IntStream.range(0, a.length).map(i -> a[i] == -1 ? i : -1).filter(i -> i != -1).boxed()
				.collect(Collectors.toList());
		for (int i = 0; i < m.size(); i++) {
			l.add(m.get(i), -1);
		}
		return l.stream().mapToInt(i -> i).toArray();
	}

}
