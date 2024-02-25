package com.rojatech.ch03.java8.streams;
import java.util.ArrayList;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		
		List<Integer> arrList = List.of(53,23,25);
		
		arrList.stream().map(i->i*i).forEach(System.out::println);

	}

}
