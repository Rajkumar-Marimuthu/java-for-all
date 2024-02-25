package com.rojatech.java14.records;

public class RecordsDemo {
	
	public static void main(String[] args) {		
		UserDetail user = new UserDetail("John", "johnny@gmail.com");
		System.out.println(user);
		System.out.println(user.name());
	}

}
