package com.rojatech.ch01.datatypes.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordReversal {

	public static void main(String[] args) {
		String str = "Java is awesome!!";
		String[] split = str.split(" ");
		String reversed = "";
		int i=0;
		while(i< split.length) {
			String string = new StringBuffer(split[i]).reverse().toString();
			reversed += string;
			i++;
			if (i!=split.length) {
				 reversed += " ";
			}
		}
		
		System.out.println(reversed);
	}

}
