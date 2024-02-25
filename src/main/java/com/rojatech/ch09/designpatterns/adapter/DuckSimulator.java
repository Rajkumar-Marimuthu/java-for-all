package com.rojatech.ch09.designpatterns.adapter;

// client
public class DuckSimulator {
	public static void main(String args[]) {
		// test a duck
		Duck duck = new MallardDuck();
		testDuck(duck);
		
		// Test a turkey
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		testDuck(turkeyAdapter);
		
		// Test a Drone
		Drone drone = new SuperDrone();
		Duck droneAdapter = new DroneAdapter(drone);
		testDuck(droneAdapter);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}

