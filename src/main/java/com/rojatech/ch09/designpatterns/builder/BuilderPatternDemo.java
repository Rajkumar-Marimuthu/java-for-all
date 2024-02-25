package com.rojatech.ch09.designpatterns.builder;


public class BuilderPatternDemo {

	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilderImpl();
		Person person = builder.setName("Raj").setAge(37).setAddress("London").build();
		System.out.println(person.toString());
		
		PersonBuilder builder1 = new PersonBuilderImpl();
		PersonDirector director = new PersonDirector(builder1);
		Person person1 = director.construct();
		System.out.println(person1.toString());
	}

}
