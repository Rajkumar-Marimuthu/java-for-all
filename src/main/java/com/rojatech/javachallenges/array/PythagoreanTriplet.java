package com.rojatech.javachallenges.array;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		//Input: arr[] = {3, 1, 4, 6, 5} 
		//Output: True 
		//There is a Pythagorean triplet (3, 4, 5).

		//Input: arr[] = {10, 4, 6, 12, 5} 
		//Output: False 
		//There is no Pythagorean triplet. 
		
		// O(n2)
		
		int[] arr1 = {3, 1, 4, 6, 5};
		int[] arr2 = {10, 4, 6, 12, 5};
		
		if (isPythagoreanTriplet(arr1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		if (isPythagoreanTriplet(arr2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

	private static boolean isPythagoreanTriplet(int[] arr) {
		int arrLen = arr.length;
		for(int i=0; i<arrLen; i++) {
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		for (int i=arrLen-1; i>=2; i--) {
			int l=0;
			int r = i-1;
			
			while(l<r) {
				if (arr[l] + arr[r] == arr[i]) {
					return true;
				} else if (arr[l] + arr[r] < arr[i]){
					l++;
				} else if (arr[l] + arr[r] > arr[i]) {
					r--;
				}
			}
			
		}
		return false;	
	}

}
