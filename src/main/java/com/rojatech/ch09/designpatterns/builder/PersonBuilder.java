package com.rojatech.ch09.designpatterns.builder;

public interface PersonBuilder {
	public PersonBuilder setName(String name);
	public PersonBuilder setAge(int age);
	public PersonBuilder setAddress(String address);
	public Person build();
}
