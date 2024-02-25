package com.rojatech.ch09.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {

	private List<Observer> observers;
	private int value = 0;
	
	public SimpleSubject() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		System.out.println("Register observer...");
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		System.out.println("Remove observer...");
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notify observer...");
		for (Observer observer: observers) {
			observer.update(value);
		}
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
}
