package com.rojatech.ch09.jvmarchitecture;

import java.lang.reflect.Method;

public class ClassLoaderDemo {

	public static void main(String[] args) {

		try {
			Class c = Class.forName("com.rojatech.ch09.jvmarchitecture.User");
			Method[] methods = c.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method);
			}
			System.out.println(methods.length);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
