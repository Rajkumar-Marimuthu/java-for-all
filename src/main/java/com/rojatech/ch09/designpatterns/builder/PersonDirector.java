package com.rojatech.ch09.designpatterns.builder;

public class PersonDirector {
	PersonBuilder personBuilder;
	
	public PersonDirector(PersonBuilder personBuilder) {
		this.personBuilder = personBuilder;
	}

	public Person construct() {
		return personBuilder.build();
	}
}
