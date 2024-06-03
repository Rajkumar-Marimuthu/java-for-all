package com.rojatech.ch01.interfaces;

import lombok.AllArgsConstructor;

import java.lang.Cloneable;

// By implementing Cloneable interface
// we make sure that instances of class A
// can be cloned.
@AllArgsConstructor
class A implements Cloneable
{
	int i;
	String s;

	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	protected Object clone()
			throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class CloneableInterfaceDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		A a = new A(20, "Rojatech");

		// cloning 'a' and holding
		// new cloned object reference in b

		// down-casting as clone() return type is Object
		A b = (A)a.clone();

		System.out.println(b.i);
		System.out.println(b.s);
	}

}
