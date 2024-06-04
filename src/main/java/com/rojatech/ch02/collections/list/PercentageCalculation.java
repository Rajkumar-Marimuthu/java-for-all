package com.rojatech.ch02.collections.list;
import java.util.Arrays;
import java.util.List;

public class PercentageCalculation {

	public static double calculateAverage(List<Integer> marks) {
		return marks.stream().mapToInt(m -> m).average().orElse(Double.NaN);
	}
	public static void main(String[] args) {
		List<Integer> markList = Arrays.asList(87,91,83,99,86);
		System.out.println(calculateAverage(markList));
	}
}
