package com.rojatech.ch01.datatypes.generics;

public class MyGenericClass<T> {
	
	T obj;
	
	MyGenericClass(T obj) {
		this.obj = obj;
	}
	
	public void displayObjectDetails() {
		System.out.println("Type of object : " + obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}

	public static void main(String[] args) {

	}

}
