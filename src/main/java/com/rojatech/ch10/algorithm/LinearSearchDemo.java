package com.rojatech.ch10.algorithm;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int nums[] = {5,7,9,11,13};
		int target = 15;
		
		int foundIndex = linearSearch(nums, target);
		if (foundIndex != -1) {
			System.out.println("Element found at index : " + foundIndex);
		} else {
			System.out.println("Element is not found");
		}
		
		foundIndex = binarySearch(nums, target);
		if (foundIndex != -1) {
			System.out.println("Element found at index : " + foundIndex);
		} else {
			System.out.println("Element is not found");
		}
	}

	private static int linearSearch(int[] nums, int target) {
		for (int i=0; i<nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	private static int binarySearch(int[] nums, int target) {
		int startIndex = 0;
		int endIndex = nums.length-1;
		// {5,7,9,11,13}; // 7
		while(startIndex <= endIndex) {
			int mid = (startIndex + endIndex) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				startIndex = mid+1;
			} else {
				endIndex = mid-1;
			}
		}
		return -1;
	}

}
