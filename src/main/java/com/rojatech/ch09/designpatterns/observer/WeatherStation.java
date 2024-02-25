package com.rojatech.ch09.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject {

	int temperature;
	int windSpeed;
	int pressure;
	
	List<WeatherObserver> observers;
	
	public WeatherStation() {
		observers = new ArrayList<WeatherObserver>();
	}
	@Override
	public void registerObserver(WeatherObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(WeatherObserver observer: observers) {
			observer.update(temperature, windSpeed, pressure);
		}
	}

	public void setValues(int temperature, int windSpeed, int pressure) {
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.pressure = pressure;
	}
}
