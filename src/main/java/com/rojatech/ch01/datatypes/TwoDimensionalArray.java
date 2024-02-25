package com.rojatech.ch01.datatypes;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		/* 4*2 = 4 Rows 2 Columns
		 	11 12
		 	21 22
		 	31 32
		 	41 42
		 */
		int[][] tab = {
				{11, 12},
				{21, 22},
				{31, 32},
				{41, 42}
		};
		
		int numOfRows = tab.length;
		System.out.printf("num of rows = %s\n", numOfRows);
        for (int[] rows : tab) {
            for (int anInt : rows) {
                System.out.print(anInt + " ");
            }
            System.out.println("");
        }
	}
}
