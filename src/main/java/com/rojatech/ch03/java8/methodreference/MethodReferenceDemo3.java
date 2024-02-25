package com.rojatech.ch03.java8.methodreference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Method Reference to an instance method of a particular object
class Person {

	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

class ComparisonProvider {
	
	public int compareByName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
	
	public int compareByAge(Person a, Person b) {
		return a.getAge().compareTo(b.getAge());
	}
}

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Raj",35));
		personList.add(new Person("Kumar", 36));
		personList.add(new Person("Murugan", 20));
		
		ComparisonProvider comparisonProvider = new ComparisonProvider();
		
		Collections.sort(personList, comparisonProvider::compareByName);
		
		// display only name
		
		personList.stream().map(p -> p.getName()).forEach(System.out::println);
		
		Collections.sort(personList, comparisonProvider::compareByAge);
		
		// display only Age
		
		personList.stream().map(p -> p.getAge()).forEach(System.out::println);
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Vicky");
		nameList.add("Ram");
		nameList.add("Sachin");
		
		Collections.sort(nameList, String::compareTo);
		System.out.println(nameList);
		nameList.stream().forEach(System.out::println);
	}

}
 