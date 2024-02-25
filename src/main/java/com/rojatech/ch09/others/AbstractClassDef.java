// abstract class works as a base for subclasses
// Advantage - You can reuse code without having to retype it
package com.rojatech.ch09.others;

abstract class Person1 {
	
	private String country;
	private String language;
	private String colour;
	
	
	public Person1(String country, String language, String colour) {
		this.country = country;
		this.language = language;
		this.colour = colour;
	}
	
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	abstract void describe();

}

class English extends Person1 {

	public English(String country, String language, String colour) {
		super(country, language, colour);
	}

	@Override
	void describe() {
		System.out.println("Engilsh man");
		System.out.println(this.getCountry());
		System.out.println(this.getLanguage());
		System.out.println(this.getColour());
	}
	
}

class French extends Person1 {

	public French(String country, String language, String colour) {
		super(country, language, colour);
	}

	@Override
	void describe() {
		System.out.println("French man");
		System.out.println(this.getCountry());
		System.out.println(this.getLanguage());
		System.out.println(this.getColour());
	}
}

public class AbstractClassDef {
	
	public static void main (String[] args) {
		
		Person1 person1 = new French("France", "French", "White");
		Person1 person2 = new English("England", "English", "White");
		
		person1.describe();
		person2.describe();
	}
}
