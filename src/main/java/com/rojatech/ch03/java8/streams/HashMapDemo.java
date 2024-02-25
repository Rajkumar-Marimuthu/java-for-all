package com.rojatech.ch03.java8.streams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	String name;
	String title;
	
	public Employee(String name, String title) {
		this.name = name;
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

public class HashMapDemo {
	
	public Map<String, List<Employee>> groupByTitle(List<Employee> empList) {
		
		/*
		 * Map<String, List<Employee>> resultMap = new HashMap<>();
		 * 
		 * for (int i=0; i<empList.size(); i++) { Employee emp = empList.get(i);
		 * 
		 * List<Employee> empSubList = resultMap.getOrDefault(emp.getTitle(), new
		 * ArrayList<Employee>()); empSubList.add(emp); resultMap.put(emp.getTitle(),
		 * empSubList); }
		 * 
		 * return resultMap;
		 */
		
		return empList.stream().collect(Collectors.groupingBy(Employee::getTitle));
	}
	public static void main(String[] args) {
		
		HashMapDemo hmd = new HashMapDemo();
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Raj", "Developer"));
		empList.add(new Employee("Raja", "UI Engineer"));
		empList.add(new Employee("Kumar", "Architect"));
		empList.add(new Employee("Raju", "Manager"));
		empList.add(new Employee("Rajkumar", "Manager"));
		empList.add(new Employee("Rajesh", "UI Engineer"));
		empList.add(new Employee("Rajendran", "DB Admin"));
		empList.add(new Employee("Rajini", "Cloud Architect"));
		empList.add(new Employee("Rajan", "Architect"));
		empList.add(new Employee("Raja", "DB Admin"));
		
		empList.forEach(obj -> System.out.println(obj.getName() + " - " + obj.getTitle()));
		
		Map<String, List<Employee>> filteredEmp = hmd.groupByTitle(empList);
		
		Set<String> titleSet = filteredEmp.keySet();
		
		titleSet.forEach(title -> System.out.println(title + " " + filteredEmp.get(title).size()));

	}

}
