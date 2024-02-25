package com.rojatech.ch03.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BIngo {

	// a player has a card represented by n*m matrix mat[n][m]
	// range 1 to n*m
	// arr[] {1,... n*m} in sequential order 5,4,8,7,6,1,9,2,3
	/*
	 * 
	 * 3 01 08
	 * 04 06 2
	 * 07 05 9
	 * 
	 * */

	// Find the first number in the sequence, either a row or a column is completely marked.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> mat = Arrays.asList(
				Arrays.asList(3,1,8), // row 1
				Arrays.asList(4,6,2), // row 2
				Arrays.asList(7,5,9)); // row 3

		List<Integer> arr = Arrays.asList(5,4,8,7,6,1,9,2,3);

		int result = getBingoNumber(mat, arr);
		System.out.println(result);
	}

	public static int getBingoNumber(List<List<Integer>> mat, List<Integer> arr) {

		// when a number is called out, the corresponding index is marked out.S
		int numOfRows = mat.size();

		// boolean firstBingoMatch = false;

		// convert 2D to 1D
		List<Integer> matList = mat.stream().flatMap(List::stream).collect(Collectors.toList()); 

		// List for marked
		List<Integer> markList = new ArrayList<Integer>();

		for (int i=0;i<matList.size();i++) {
			markList.add(0);
		}

		System.out.println(matList);
		System.out.println(arr);

		for (Integer n : arr) {
			if ( matList.contains(n)) {
				markList.set(matList.indexOf(n), 1);
				if (checkBingo(markList, numOfRows)) {
					return n;
				}
			}
		}
		return 0;
	}

	static boolean checkBingo(List<Integer> markList, int numOfRows) {
		int numOfColumns = markList.size()/numOfRows;
		// Row-wise check
		int rowSize = numOfColumns;
		int i=0;
		while (i<markList.size()) { // take full list
			int rowSum = 0;
			for (int j=i; j< i+rowSize; j++) { // take row wise
				rowSum += markList.get(j);	
			}
			if (rowSum == rowSize) {
				return true;
			}
			i+=rowSize; // move to next row
		}

		// Column-wise check
		int columnSize = numOfRows;
		i=0;
		while ( i<markList.size()) { // take full list
			int columnSum = 0;
			for (int j=i; j< i+columnSize; j++) { // take column wise
				columnSum += markList.get(j);	
			}
			if (columnSum == columnSize) {
				return true;
			}
			i+=columnSize; // move to next column
		}
		return false;
	}
}