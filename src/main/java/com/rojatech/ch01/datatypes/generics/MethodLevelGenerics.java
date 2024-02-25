package com.rojatech.ch01.datatypes.generics;

public class MethodLevelGenerics {
	public <T> void method(T t) {
		
	}
	
	public <T extends Runnable> void method2(T t) {
		
	}
	
	public <T extends Runnable&Comparable<String>> void method3(T t) { 
	}
	
}
 