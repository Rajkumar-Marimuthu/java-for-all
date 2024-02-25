package com.rojatech.ch09.designpatterns.adapter;

public class SuperDrone implements Drone {

	@Override
	public void beep() {
		System.out.println("beep beep beep");
	}

	@Override
	public void spin_rotors() {
		System.out.println("spin started");

	}

	@Override
	public void take_off() {
		System.out.println("take off");
	}
}
