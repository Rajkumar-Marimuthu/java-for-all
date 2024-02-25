package com.rojatech.ch09.designpatterns.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
