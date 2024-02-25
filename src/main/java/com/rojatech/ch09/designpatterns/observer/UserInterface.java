package com.rojatech.ch09.designpatterns.observer;

public class UserInterface implements WeatherObserver {

	private int temperature;
	private int windSpeed;
	private int pressure;
	
	WeatherStation weatherStation;
	
	public void UserInteface(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
		weatherStation.registerObserver(this);
	}
	@Override
	public void update(int temperature, int windSpeed, int pressure) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.pressure = pressure;
	}

	public void display() {
		System.out.println("display():");
		System.out.println("temperature = " + temperature);
		System.out.println("windSpeed = " + windSpeed);
		System.out.println("pressure = " + pressure);
	}
}
