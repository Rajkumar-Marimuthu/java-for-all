package com.rojatech.javachallenges.array;

public class ProductOfArrayExceptItself {

	public static void main(String[] args) {
		//Input: arr[]  = {10, 3, 5, 6, 2}
		//Output: prod[]  = {180, 600, 360, 300, 900}
		
		int[] arr = {10, 3, 5, 6, 2};
		int[] res = new int[arr.length];

		for(int i=0; i<arr.length;i++) {
			int x = 1;
			for(int j=0; j<arr.length;j++) {
				if (i==j) {
					continue;
				} else {
					x = x*arr[j];
				}
			}
			res[i] = x;
		}
		for (int i : arr) {
			System.out.print(i+ ", ");
		}
		System.out.println();
		for (int i : res) {
			System.out.print(i+ ", ");
		}
	}
}
