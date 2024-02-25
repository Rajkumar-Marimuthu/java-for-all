// Java code for Bill Pugh Singleton Implementation

/*When the singleton class is loaded, inner class is not loaded and 
hence doesn�t create object when loading the class. 
Inner class is created only when getInstance() method is called. 
So it may seem like eager initialization but it is lazy initialization. 
This is the most widely used approach as it doesn�t use synchronization.*/
package com.rojatech.ch09.designpatterns.singleton;

public class SingletonDemo3 {

	// private constructor
	private SingletonDemo3() {
	}
	
	// inner class to provide instance
	private static class BillPughSingleton
	{
		private static final SingletonDemo3 INSTANCE =  new SingletonDemo3();
	}
	
	public static SingletonDemo3 getInstance() {
		return BillPughSingleton.INSTANCE;
	}
	public static void main(String[] args) {
		
		SingletonDemo3 sd = SingletonDemo3.getInstance();
		SingletonDemo3 sd1 = SingletonDemo3.getInstance();
		
		System.out.println(sd);
		System.out.println(sd1);
	}

}
