package com.rojatech.ch09.designpatterns.observer;

public class Alert implements WeatherObserver {

	private int temperature;
	private int windSpeed;
	private int pressure;
	
	WeatherStation weatherStation;
	
	@Override
	public void update(int temperature, int windSpeed, int pressure) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.pressure = pressure;
	}
	
	public void alert() {
		System.out.println("alert():");
		System.out.println("temperature = " + temperature);
		System.out.println("windSpeed = " + windSpeed);
		System.out.println("pressure = " + pressure);
	}

}
