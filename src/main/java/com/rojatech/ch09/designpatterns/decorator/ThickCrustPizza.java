package com.rojatech.ch09.designpatterns.decorator;

public class ThickCrustPizza extends Pizza {

	public String getDescription() {
		return "Thick crust pizza";
	}
	
	@Override
	public double cost() {
		return 15.0;
	}

}
