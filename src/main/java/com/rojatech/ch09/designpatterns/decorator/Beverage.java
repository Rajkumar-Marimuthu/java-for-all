package com.rojatech.ch09.designpatterns.decorator;

import lombok.Getter;

public abstract class Beverage {
	@Getter
    String description = "Unknown Beverage";
	private Boolean milk;
	private Boolean soy;
	private Boolean mocha;
	private Boolean whip;

    public abstract double cost();
	
}
