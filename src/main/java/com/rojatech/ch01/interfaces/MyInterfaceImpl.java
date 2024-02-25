package com.rojatech.ch01.interfaces;

public class MyInterfaceImpl implements MyInterface {

	public static void main(String[] args) {

		MyInterface me = new MyInterfaceImpl();
		me.show(6);
		
		// Anonymous inner class
		MyInterface me2 = new MyInterface() {
			public void show(int i) {
				System.out.println("hello2 " + i);
			}
		};
		me2.show(6);

		// Lambda expression
		MyInterface me3 = i ->	System.out.println("hello3 " + i);
		me3.show(6);
	}

	@Override
	public void show(int i) {
		System.out.println("Hello " + i);
	}

}
