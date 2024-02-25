package com.rojatech.ch03.java8.streams;
public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		AdderImpl adderImpl = new AdderImpl();
		
		String r = adderImpl.add(a->a+"lambda");
		System.out.println(r);

	}

}
