package com.rojatech.ch07.innerclass;

public class LocalInnerClassDemo {

	void f1() {
		System.out.println("Inside Local outer f1()");
		class LocalInner {
			void f2() {
				System.out.println("Inside Local inner f2()");
			}
		}
		LocalInner localInner = new LocalInner();
		localInner.f2();
	}
	public static void main(String[] args) {
		LocalInnerClassDemo  outer = new LocalInnerClassDemo();
		
		outer.f1();
	}

}
