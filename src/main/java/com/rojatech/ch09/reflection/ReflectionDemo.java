package com.rojatech.ch09.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {

	public static void main(String[] args) {
		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));
			
			Constructor<?> constructor = myClass.getConstructor(null);
			Object myDefObj = constructor.newInstance(null);
			
			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			Object myobj = constructor2.newInstance(5.0,6.0);
			
			Method setNum1 = myClass.getMethod("setNum1", double.class);
			setNum1.invoke(myDefObj, 12.0);
			
			Method setNum2 = myClass.getMethod("setNum2", double.class);
			setNum2.invoke(myDefObj, 14.0);
			
			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);
			num1Field.setDouble(myobj, 10.0);
			
			Method getNum1 = myClass.getMethod("getNum1", null);
			double num1 = (double)getNum1.invoke(myobj, null);
			
			Method getNum2 = myClass.getMethod("getNum2", null);
			double num2 = (double)getNum2.invoke(myobj, null);
			
			Method sum = myClass.getMethod("sum", double.class, double.class);
			double res = (double)sum.invoke(myobj, num1, num2);
			System.out.println("sum = " + res);
			
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			MyAnnotation annotation = (MyAnnotation)annotations[0];
			System.out.println(annotation.value1());
			System.out.println(annotation.value2());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

}
