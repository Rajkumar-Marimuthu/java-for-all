package com.rojatech.java14.records;

import java.util.Objects;

public class Employee {
	private String name;
	private int sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, sal);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && sal == other.sal;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}

}
