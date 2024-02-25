package com.rojatech.java09.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {

	public static void main(String[] args) {

		List<String> l1 = Arrays.asList("abc", "efg");
		List<String> l2 = Arrays.asList("xyz", "lkn");
		SafeVarArgsDemo sd = new SafeVarArgsDemo();
		sd.myMethod(l1,l2);
	}

	@SafeVarargs
	private void myMethod(List<String> ...l) { // List<String>[]
		String j = l[1].get(0);
		System.out.println(j);
		
	}
}
