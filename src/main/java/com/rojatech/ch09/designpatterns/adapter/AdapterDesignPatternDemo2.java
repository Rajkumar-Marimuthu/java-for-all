package com.rojatech.ch09.designpatterns.adapter;
interface Bird {
	public void fly();
	public void makeSound();
}

class Sparrow implements Bird {

	@Override
	public void fly() {
		System.out.println("Flying");
	}

	@Override
	public void makeSound() {
		System.out.println("Chirp Chirp");
	}
}

interface ToyDuck {
	public void squeak();
}

class PlasticToyDuck implements ToyDuck {

	@Override
	public void squeak() {
		System.out.println("Squeak");
	}	
}

class BirdAdapter implements ToyDuck {
	Bird bird;

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();
	}
}

public class AdapterDesignPatternDemo2 {

	public static void main(String[] args) {
		Bird sparrow = new Sparrow();
		sparrow.fly();
		sparrow.makeSound();
		
		ToyDuck toyDuck = new PlasticToyDuck();
		toyDuck.squeak();
		
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		birdAdapter.squeak();
		
	}

}
