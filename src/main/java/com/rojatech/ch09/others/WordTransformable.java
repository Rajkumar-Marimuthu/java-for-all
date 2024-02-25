package com.rojatech.ch09.others;

public interface WordTransformable {
	
	public static String transformTextCamelCase(String input) {
		String[] inputArr = input.split(" ");
		StringBuilder result = new StringBuilder();
		for (String str : inputArr) {
			result.append(str.substring(0,1).toUpperCase()+str.substring(1));
		}
		return result.toString();
	}

	public static String transformSnakeCase(String input) {
		String[] inputArr = input.split(" ");
		StringBuilder result = new StringBuilder();
		for (String str : inputArr) {
			result.append(str.toUpperCase() + "_");
		}
		return result.toString();
	}
}
