package com.rojatech.ch02.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();

		values.add(345);
		values.add(104);
		values.add(836);
		values.add(1, 533);

		System.out.println(values);
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 100 > o2 % 100)
					return 1;
				return -1;
			}
		};

		values.sort(comparator);
		System.out.println(values);
	}
}