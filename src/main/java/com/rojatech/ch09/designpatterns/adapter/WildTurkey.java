package com.rojatech.ch09.designpatterns.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("gobble...");
	}

	@Override
	public void fly() {
		System.out.println("fly...");
	}

}
