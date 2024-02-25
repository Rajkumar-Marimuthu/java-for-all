package com.rojatech.ch01.datatypes;

public class ImmutableClassDemo {
	
	int x;
	
	ImmutableClassDemo(int x) {
		this.x = x;
	}
	
	public ImmutableClassDemo change (int x) {
		if (this.x == x) {
			return this;
		} else {
			return new ImmutableClassDemo(x);
		}
	}
	
	public static void main(String[] args) {
		ImmutableClassDemo ic1 = new ImmutableClassDemo(20);
		ImmutableClassDemo ic2 = ic1.change(20);
		System.out.println(ic1 == ic2);
		ImmutableClassDemo ic3 = ic1.change(10);
		System.out.println(ic3 == ic1);
	}

}
