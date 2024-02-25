package com.rojatech.ch09.designpatterns.decorator;

public abstract class Pizza {
	String description = "Unknown";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
