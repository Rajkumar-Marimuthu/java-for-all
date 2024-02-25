package com.rojatech.ch07.innerclass;

public class InnerClassDemo {

	static void f1() {
		System.out.println("outer static f1");
	}
	static class Inner {
		static void f2() {
			System.out.println("inner static f2");
		}
		
		void f3() {
			System.out.println("inner non-static f3");
		}
	}
	
	public static void main(String[] args) {
		
		f1();
		Inner.f2();
		InnerClassDemo.Inner inner = new InnerClassDemo.Inner();
		inner.f3();
	}

}
