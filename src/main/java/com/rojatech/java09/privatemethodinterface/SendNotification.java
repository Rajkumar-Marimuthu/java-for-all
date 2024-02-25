package com.rojatech.java09.privatemethodinterface;

public interface SendNotification {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending multiple notification");
	}
	
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending notification");
	}
	
	private static void establishConnection() {
		System.out.println("Establishing a connection");
	}
}
