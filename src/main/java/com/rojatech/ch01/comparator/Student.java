package com.rojatech.ch01.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }

        // Sort by CGPA desc, then first name asc, then id asc
        Comparator<Student> comparator =
                Comparator.comparingDouble(Student::getCgpa).reversed()
                          .thenComparing(Student::getFname)
                          .thenComparingInt(Student::getId);
        studentList.sort(comparator);

        // Print only first names as per the typical requirement
        for (Student s : studentList) {
            System.out.println(s.getFname());
        }
    }
}
