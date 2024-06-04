package com.rojatech.java10.var;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VarDemo {
	

	public static void main(String[] args) {
		var x = 10;
		var ch = 'A';
		var name = "Rajkumar";
		x=8;
		System.out.println(x);
		System.out.println(ch);
		System.out.println(name);
		
		var myDict = new HashMap<String, List<String>>();
		myDict.put("RBC", Arrays.asList("Wokingham", "Reading", "Newbury"));
		myDict.put("LBC", Arrays.asList("City of London", "Honslou", "Paddington"));
		
		for (var entry : myDict.entrySet()) {
			System.out.println(entry);
		}
	}
}
