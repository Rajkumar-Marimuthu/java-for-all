package com.rojatech.ch10.algorithm;

public class QuickSortDemo {

	private static int partition(int[] arr, int low, int high) {
		int piv = arr[high];
		int i = low-1;
		for (int j=low;j<high;j++) {
			if (arr[j]<piv) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		int pivIndex = i+1;

		return pivIndex;
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low<high) {
			int pivIndex = partition(arr, low, high);
			
			quickSort(arr,low,pivIndex-1);
			quickSort(arr,pivIndex+1,high);
		}
	}

	public static void main(String[] args) {
		int[] arr = {100200000,100000,1000000};
		quickSort(arr,0,arr.length-1);
		for (int num : arr) {
			System.out.print(num + ", ");
		}
		System.out.println();
	}
}
