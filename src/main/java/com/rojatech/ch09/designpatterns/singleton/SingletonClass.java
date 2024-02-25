package com.rojatech.ch09.designpatterns.singleton;

public class SingletonClass {
	
	private static SingletonClass instance;
	
	// Private constructor to prevent instantiation from outside the class
    private SingletonClass() {
        // Initialization code, if needed
    }
    
	public static SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		} 
		return instance;
	}
	
	// Other methods, if any
	public void displayMessage() {
        System.out.println("Hello, I am a singleton instance!");
    }

}
