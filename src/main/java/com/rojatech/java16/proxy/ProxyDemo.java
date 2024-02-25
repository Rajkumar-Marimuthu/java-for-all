package com.rojatech.java16.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class<?>[] {Worker.class}, 
(prox, method, arguments) -> {
	return InvocationHandler.invokeDefault(prox, method, arguments);
});
		try {
			Method method = proxy.getClass().getMethod("workerjob");
			System.out.println(method.invoke(proxy));
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
