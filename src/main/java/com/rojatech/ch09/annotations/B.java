package com.rojatech.ch09.annotations;

import java.util.ArrayList;
import java.util.List;

public class B {

	@SuppressWarnings(value = { "deprecation", "rawtypes" })
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		a.method1();
		a.method2();
		
		List list = new ArrayList();
		System.out.println(list);
	}

}
