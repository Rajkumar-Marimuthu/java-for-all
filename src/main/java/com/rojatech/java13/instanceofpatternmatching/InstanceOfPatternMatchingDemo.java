package com.rojatech.java13.instanceofpatternmatching;

public class InstanceOfPatternMatchingDemo {

	public static void main(String[] args) {
		Object object = get();
		if (object instanceof String str) {
			//String str = (String) object;
			System.out.println(str);
		}
	}
	
	public static Object get() {
		return "Pattern matching in action";
	}

}
