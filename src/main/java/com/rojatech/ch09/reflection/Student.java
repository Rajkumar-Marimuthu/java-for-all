package com.rojatech.ch09.reflection;

import java.lang.reflect.InvocationTargetException;

public class Student implements Cloneable {

	public static void main(String[] args) {
		Student s1 = new Student();
		try {
			Student s2 = Student.class.getConstructor().newInstance(null);
			Student s3 = (Student) s1.clone();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
