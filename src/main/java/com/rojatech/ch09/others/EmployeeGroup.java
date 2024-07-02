package com.rojatech.ch09.others;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Setter
@Getter
@AllArgsConstructor
class Employee {
	
	private int id;
	private String name;
	private String designation;
	private String gender;
	private long salary;
}

public class EmployeeGroup {

	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<>(); 
		employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
		employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
		employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
		employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
		employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));

		//List<Employee> maleList = employeesList.stream().filter(emp -> emp.getGender().equals("Male")).collect(Collectors.toList());
		//System.out.println(maleList.size());
		
		Map<String, Long> result = employeesList.stream().collect(
				Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(result);
		
		Map<String, Long> res = employeesList.stream().collect(
				Collectors.groupingBy(Employee::getGender, Collectors.summingLong(Employee::getSalary)));
		System.out.println(res);
		
		Map<String, List<Employee>> groupByGender = employeesList.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(groupByGender);
		
		Map<String, Set<String>> groupByGen = employeesList.stream().collect(
				Collectors.groupingBy(Employee::getGender, 
				Collectors.mapping(Employee::getName, Collectors.toSet())));
		
		System.out.println(groupByGen);
	}

}

