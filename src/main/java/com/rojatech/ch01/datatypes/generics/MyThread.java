package com.rojatech.ch01.datatypes.generics;

public class MyThread extends Thread implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		return 0;
	}

}
