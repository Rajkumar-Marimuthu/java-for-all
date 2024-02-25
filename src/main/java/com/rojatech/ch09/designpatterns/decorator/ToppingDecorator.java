package com.rojatech.ch09.designpatterns.decorator;

public abstract class ToppingDecorator extends Pizza {
	Pizza pizza;
	
	public abstract String getDescription();
	
}
