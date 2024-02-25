package com.rojatech.javachallenges.array;

public class FindPairOfSum {

	public static void main(String[] args) {
// input [1,2,3,9] , sum = 8, output: No
// input [1,2,4,4], sum = 8, output: Yes, 4+4
		
		int[] arr = {1,2,4,4};
		int sum = 8;
		
		boolean res = findPairOfSum(arr, sum);
	}

	private static boolean findPairOfSum(int[] arr, int sum) {
		int l=0;
		int r=arr.length-1;
		
		while(l<r) {
			if(arr[l]+arr[r] == sum) {
				System.out.println("Yes. Sum of " + arr[l] + " at index " + l + " and " + arr[r] + "at index " + r + " = sum " + sum);
				return true;
			} else if (arr[l]+arr[r] < sum) {
				l++;
			} else if (arr[l]+arr[r] > sum) {
				r--;
			}
		}
		System.out.println("No.");
		return false;
	}

}
