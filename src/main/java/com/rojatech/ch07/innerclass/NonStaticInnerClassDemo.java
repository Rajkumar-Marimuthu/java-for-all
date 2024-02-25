package com.rojatech.ch07.innerclass;

public class NonStaticInnerClassDemo {
	
	private static int x = 50;
	private int y;
	
	NonStaticInnerClassDemo(int y) {
		this.y = y;
	}
	
	void f1() {
		System.out.println("outer non-static f1");
	}

	class Inner {
		private int y;
		Inner(int y) {
			this.y = y;
		}
		void f2() {
			System.out.println(x);
			System.out.println(NonStaticInnerClassDemo.this.y);
			System.out.println(this.y);
			System.out.println("inner non-static f2");
		}	
	}
	public static void main(String[] args) {

		NonStaticInnerClassDemo oc = new NonStaticInnerClassDemo(80);
		oc.f1();
		NonStaticInnerClassDemo.Inner inner = oc.new Inner(30);
		inner.f2();
	}

}
