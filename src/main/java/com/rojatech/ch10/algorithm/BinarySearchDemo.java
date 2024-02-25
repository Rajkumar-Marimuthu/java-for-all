package com.rojatech.ch10.algorithm;

/* Binary Search is defined as a searching algorithm used in a sorted array 
 * by repeatedly dividing the search interval in half. 
 * The idea of binary search is to use the information that the array is sorted and 
 * reduce the time complexity to O(log N). 
 * */

// Consider an array arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, and the target = 23.

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int target = 23;
		
		int res = binarySearch(arr, target);
		System.out.println(res);
	}

	private static int binarySearch(int[] arr, int target) {
		int l = 0;
		int r = arr.length-1;
		while (l < r) {
			int mid = (l+r)/2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				r = mid-1;
			} else if (arr[mid]< target) {
				l = mid+1;
			}
		}
		return 0;
	}

}
