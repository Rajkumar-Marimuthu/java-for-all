package com.rojatech.ch09.designpatterns.decorator;

public class Cheese extends ToppingDecorator {

	@Override
	public String getDescription() {
		return "";
	}

	@Override
	public double cost() {
		return 0;
	}

}
