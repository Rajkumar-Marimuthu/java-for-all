package com.rojatech.ch01.datatypes.generics;

public class GenericsDemo {

	public static void main(String[] args) {
		
		MyGenericClass<String> s = new MyGenericClass<>("Bharath");
		s.displayObjectDetails();
		
		MyGenericClass<Integer> i = new MyGenericClass<>(54);
		i.displayObjectDetails();
		
		MyGenericClass<Double> d = new MyGenericClass<>(54.50);
		d.displayObjectDetails();
		
		
	}

}
