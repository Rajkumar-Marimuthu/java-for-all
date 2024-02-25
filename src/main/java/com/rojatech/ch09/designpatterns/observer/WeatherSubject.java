package com.rojatech.ch09.designpatterns.observer;

public interface WeatherSubject {
	public void registerObserver(WeatherObserver observer);
	public void removeObserver(WeatherObserver observer);
	public void notifyObservers();
}
