package com.rojatech.javachallenges.array;

import java.util.Arrays;
import java.util.HashSet;

// Given an array A[] of n numbers and another number x, 
// the task is to check whether or not there exist two elements in A[] whose sum is exactly x. 
// Input: arr[] = {0, -1, 2, -3, 1}, x= -2
// Output: Yes
// Explanation:  If we calculate the sum of the output,1 + (-3) = -2
// Input: arr[] = {1, -2, 1, 0, 5}, x = 0
// Output: No

public class CheckSumofPair {

	public static Boolean IsSumOfPairMatched(int arr[], int n) {
		
		Arrays.sort(arr);
		
		int l = 0;
		int r = arr.length-1;
		
		while(l<r) {
			int sum = arr[l] + arr[r];
			if (sum == n) {
				return true;
			} else if ( sum < n ) {
				l++;
			} else if ( sum > n ) {
				r--;
			}
		}
		
		return false;
	}
	
	public static Boolean IsSumOfPairMatched2(int arr[], int n) {
		HashSet<Integer> set = new HashSet<Integer>(); 
		for(int i=0; i<arr.length;i++) {
			int temp = n - arr[i];
			if (set.contains(temp)) {
				return true;
			} else {
				set.add(arr[i]);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 7;
     
        
        Boolean res = IsSumOfPairMatched(A, n);
        if (res) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
        Boolean res1 = IsSumOfPairMatched2(A, n);
        if (res1) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}

}
