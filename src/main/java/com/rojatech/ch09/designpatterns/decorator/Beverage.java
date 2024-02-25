package com.rojatech.ch09.designpatterns.decorator;

public abstract class Beverage {
	String description = "Unknown Beverage";
	private Boolean milk;
	private Boolean soy;
	private Boolean mocha;
	private Boolean whip;
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
