package com.rojatech.javachallenges.others;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

record Employee(int id, String name, String designation, String gender, long salary) {

}

public class EmployeeGroup {

    public static void main(String[] args) {
        List<Employee> employeesList = List.of(
        new Employee(101, "Glady", "Manager", "Male", 25_00_000),
        new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000),
        new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000),
        new Employee(104, "Nike", "Manager", "Female", 25_00_000),
        new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000),
        new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000),
        new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));


        //List<Employee> maleList = employeesList.stream().filter(emp -> emp.getGender().equals("Male")).collect(Collectors.toList());
        //System.out.println(maleList.size());

        Map<String, Long> result = employeesList.stream().collect(
                Collectors.groupingBy(Employee::gender, Collectors.counting()));
        System.out.println(result);

        Map<String, Long> res = employeesList.stream().collect(
                Collectors.groupingBy(Employee::gender, Collectors.summingLong(Employee::salary))
        );
        System.out.println(res);

        Map<String, List<Employee>> groupByGender = employeesList.stream().collect(Collectors.groupingBy(Employee::gender));
        System.out.println(groupByGender);

        Map<String, Set<String>> groupByGen = employeesList.stream().collect(
                Collectors.groupingBy(Employee::gender,
                        Collectors.mapping(Employee::name, Collectors.toSet())
                ));

        System.out.println(groupByGen);
    }

}

