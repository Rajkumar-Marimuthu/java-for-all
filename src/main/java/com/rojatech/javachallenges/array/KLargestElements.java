package com.rojatech.javachallenges.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KLargestElements {

	public static void main(String[] args) {
		// Input:  [1, 23, 12, 9, 30, 2, 50], K = 3
		// Output: 50, 30, 23

		// Input:  [11, 5, 12, 9, 44, 17, 2], K = 2
		// Output: 44, 17
		
		// Time complexity: O(N * log(N))
		
		int[] arr1 = {1, 23, 12, 9, 30, 2, 50};
		Integer[] arr2 = {11, 5, 12, 9, 44, 17, 2};
		int k1 = 3;
		int k2 = 2;
		List<Integer> res = findKLargestElements(arr1, k1);
		//findKLargestElements(Integer[] arr, int k);
		System.out.println(res);
		
	}
	
	public static ArrayList<Integer> findKLargestElements(int[] arr, int k) {
		Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(boxed, Collections.reverseOrder());
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i=0; i<k; i++) {
			res.add(boxed[i]);
		}
		return res;
	}

}
