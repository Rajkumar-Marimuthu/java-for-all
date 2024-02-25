package com.rojatech.ch09.designpatterns.observer;

public class Logger implements WeatherObserver {

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

	public void log() {
		System.out.println("log():");
		System.out.println("temperature = " + temperature);
		System.out.println("windSpeed = " + windSpeed);
		System.out.println("pressure = " + pressure);
	}
}
