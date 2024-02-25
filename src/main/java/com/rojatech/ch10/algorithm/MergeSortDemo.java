package com.rojatech.ch10.algorithm;

public class MergeSortDemo {

	private static void mergeSort(int[] arr, int low, int high) {
		System.out.println("low: " + low + ", " + "high: " + high);
		if (low<high) {
			int med = (low + high) / 2;
			System.out.println("med: " + med);
			mergeSort(arr, low, med);
			mergeSort(arr, med+1, high);
			merge(arr,low,med,high);
		}
	}

	private static void merge(int[] arr, int low, int med, int high) {
		
		for(int i=low; i<=med; i++) {
			for (int j=med+1;j<=high;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {8,5,9,1,6,7};
		int low = 0;
		int high = arr.length-1;
		mergeSort(arr, low, high);
		for (int i : arr) {
			System.out.print(i+", ");
		}
		System.out.println();	
	}
}
