package com.rojatech.ch02.collections.list;
import java.util.Arrays;
import java.util.List;

public class PercentageCalculation {

	public double calculateAverage(List<Integer> marks) {
		
		return marks.stream().mapToInt(m -> m).average().getAsDouble();
		
	}
	public static void main(String[] args) {
		
		List<Integer> markList = Arrays.asList(87,91,83,99,86);
		
		PercentageCalculation pc = new PercentageCalculation();
		
		System.out.println(pc.calculateAverage(markList));

	}

}
