package com.rojatech.ch09.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bingo {

	public static void main(String[] args) {

		List<String> bingoPool = new ArrayList<String>(75);

		int start = 1;
		for ( char c : "BINGO".toCharArray()) {
			for (int i=start;i<start+15;i++) {
				bingoPool.add("" + c + i);
			}
			start += 15;
		}
		Collections.shuffle(bingoPool);
		bingoPool.stream().forEach(System.out::println);

		List<String> firstColumn = bingoPool.subList(0, 15);
		firstColumn.sort(Comparator.naturalOrder());

		firstColumn.replaceAll(s -> {
			if (s.indexOf("G") == 0 || s.indexOf("O") == 0) {
				String updated = s.charAt(0)+"-"+s.substring(1);
				return updated;
			}
			return s;
		});
		
		firstColumn.stream().forEach(System.out::println);
	}
}
