package com.rojatech.ch03.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonStreamExample {

	public static void main(String[] args) {
		String[] names = {"Pichai", "Elon", "Mike", "Amit", "Mary", "Laila", "Sairam"};
		List<String> nameList = Arrays.stream(names).filter(name -> name.startsWith("A") || name.startsWith("B")).toList();
		System.out.println(nameList);

		List<String> newNameList = Arrays.stream(names).filter(name -> !name.equals("Mike")).collect(Collectors.toList());
		System.out.println(newNameList);
	}

}
