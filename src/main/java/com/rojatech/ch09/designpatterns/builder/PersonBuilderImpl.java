package com.rojatech.ch09.designpatterns.builder;

public class PersonBuilderImpl implements PersonBuilder {
	String name;
	int age;
	String address;

	@Override
	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	@Override
	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	
	@Override
	public Person build() {
		return new Person(name, age, address);
	}
}
