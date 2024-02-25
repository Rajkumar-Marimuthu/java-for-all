package com.rojatech.ch09.designpatterns.adapter;
interface Movable {
	// returns speed in MPH
	double getSpeed();
}

class BugattiVeyron implements Movable {
	@Override
	public double getSpeed() {
		return 268;
	}
}

// The adapter pattern convert the interface of a class into another interface clients expect
interface MovableAdapter {
	// returns speed in KPH
	double getSpeed();
}

class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKPH(double speed) {
		return speed * 1.60934;
	}
}

public class AdapterDesignPatternDemo {

	public static void main(String[] args) {
		Movable buggatiVeyron = new BugattiVeyron();
		MovableAdapter movableAdapter = new MovableAdapterImpl(buggatiVeyron);
		System.out.println(movableAdapter.getSpeed());
	}

}
