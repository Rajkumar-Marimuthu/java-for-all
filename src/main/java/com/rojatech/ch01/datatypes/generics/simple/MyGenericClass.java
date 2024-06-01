package com.rojatech.ch01.datatypes.generics.simple;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MyGenericClass<T> {
	
	T obj;
	
	public void displayObjectDetails() {
		System.out.println("Type of object : " + obj.getClass().getName());
	}

}
