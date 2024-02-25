package com.rojatech.ch09.designpatterns.decorator;

public class CoffeeShop {

	public static void main(String[] args) {
		
		Beverage beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}

}
