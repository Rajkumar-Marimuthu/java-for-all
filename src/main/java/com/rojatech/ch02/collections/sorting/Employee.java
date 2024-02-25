package com.rojatech.ch02.collections.sorting;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.id < o.id) {
			return -1;
		} else if (this.id > o.id ) {
			return 1;
		} 
		return 0;
	}
}
