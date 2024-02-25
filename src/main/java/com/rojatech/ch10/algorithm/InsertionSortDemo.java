package com.rojatech.ch10.algorithm;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] nums = {3, 6, 10, 2, 1, 5, 11, 8, 4, 9, 7, 15, 12, 14, 13};
		for(int i=1; i<nums.length;i++) {
			int insertIndex = i;
			int temp = nums[i];
			int j = i-1;
			while ( j>=0 && nums[j] > temp ) {
				nums[j+1] = nums[j];
				insertIndex = j;
				j--;
			}
			if (i != insertIndex) {
				nums[insertIndex] = temp;
			}
			for (int num : nums) {
				System.out.print(num + ", ");
			}
			System.out.println();
		}			
	}
}


