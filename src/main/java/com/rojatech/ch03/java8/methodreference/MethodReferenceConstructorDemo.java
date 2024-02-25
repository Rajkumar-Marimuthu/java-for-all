package com.rojatech.ch03.java8.methodreference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class Person1 {
		
	private String name;
	private Integer age;
	
	public Person1() {
		Random ran = new Random();
		
		this.name = ran.ints(97,123).limit(7)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}
	
}

public class MethodReferenceConstructorDemo {
	
	public static <T> List<T> getObjectList(int length, Supplier<T> objectSupply) {
		List<T> list = new ArrayList<T>();
		
		for (int i=0; i<length; i++) {
			list.add(objectSupply.get());			
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		List<Person1> personList = getObjectList(5, Person1::new);
		
		personList.stream().map(x -> x.getName()).forEach(System.out::println);
	}

}
