package com.rojatech.ch09.designpatterns.adapter;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("quack...");
	}

	@Override
	public void fly() {
		System.out.println("fly...");
	}

}
