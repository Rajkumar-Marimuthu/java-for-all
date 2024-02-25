package com.rojatech.ch02.collections.sorting;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeSortingTest {

	public static void main(String[] args) {
		Set<Employee> employeeSet = new TreeSet<Employee>(new EmployeeNameComparator());
		employeeSet.add(new Employee(12,"Raj"));
		employeeSet.add(new Employee(22,"Raja"));
		employeeSet.add(new Employee(15,"Raju"));
		employeeSet.add(new Employee(14,"Rajesh"));
		
		for (Employee employee : employeeSet) {
			System.out.println(employee.id + " " + employee.name);
		}
	}

}
