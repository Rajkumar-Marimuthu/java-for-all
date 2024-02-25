package com.rojatech.javachallenges.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 6, 3, 6, 1};
		//Output: 1, 3, 6
		int alen = arr.length; // 7
		Set<Integer> origSet = new HashSet<Integer>();
		Set<Integer> dupSet = new HashSet<Integer>();

		for (int i=0;i<alen;i++) {
			if (origSet.contains(arr[i])) {
				dupSet.add(arr[i]);
			} else {
				origSet.add(arr[i]);
			}
		}
		System.out.println(dupSet);
	}
}
