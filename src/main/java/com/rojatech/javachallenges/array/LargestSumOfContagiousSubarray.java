package com.rojatech.javachallenges.array;

public class LargestSumOfContagiousSubarray {

	public static void main(String[] args) {
		// Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
		// Time Complexity: O(n)
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3}; 
		
		int sum = maxSubArraySum(arr);
		System.out.println(sum);
	}

	private static int maxSubArraySum(int[] arr) {
		int len = arr.length;
		int sum_at = 0;
		int max_sum = 0;
		int s = 0;
		int start = 0;
		int end = 0;
		
		for (int i=0; i<len;i++) {
			sum_at += arr[i];
			if (max_sum < sum_at ) {
				max_sum = sum_at;
				start = s;
				end = i;
			}
			if (sum_at <0) {
				sum_at = 0;
				s = i+1;
			}
		}
		System.out.println(start + "->" +end);
		return max_sum;
	}

}
