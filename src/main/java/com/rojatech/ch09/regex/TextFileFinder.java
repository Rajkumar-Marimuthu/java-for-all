package com.rojatech.ch09.regex;

import java.io.File;
import java.util.Arrays;

public class TextFileFinder {

	public static void main(String[] args) {
		File directory = new File("D:\\javaworkspace\\Ramanujan\\src\\main\\java\\com\\rojatech\\ramanujan\\ch9\\regex");
		String[] fileNames = directory.list();
		Arrays.stream(fileNames).filter(name -> name.matches("^[\\w]+.txt$")).forEach(System.out::println);
	}

}
