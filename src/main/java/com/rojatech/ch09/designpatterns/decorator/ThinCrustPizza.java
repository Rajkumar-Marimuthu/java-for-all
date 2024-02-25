package com.rojatech.ch09.designpatterns.decorator;

public class ThinCrustPizza extends Pizza {

	public String getDescription() {
		return "Thin Crust Pizza";
	}
	
	@Override
	public double cost() {
		return 10.0;
	}

}
