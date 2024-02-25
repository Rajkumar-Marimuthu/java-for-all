package com.rojatech.ch01.datatypes.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hello, how are you?");
		System.out.println(sb.capacity());
		sb.append(" when you are coming back to office?");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());
	}

}
