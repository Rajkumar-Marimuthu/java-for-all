package com.rojatech.ch01.oops;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
class Student {
    String name;
    int id;
    String dept;
}
 
// Department class contains list of student objects
// It is associated with student class through its Objects
@AllArgsConstructor
@Getter
class Department {
    String name;
    private List<Student> students;
}
 
//  Institute class contains list of Department Objects. It is associated with Department class through its Objects
@AllArgsConstructor
class Institute {
    String instituteName;
    private List<Department> departments;

    // Counting total students of all departments in a given institute
    public int getTotalStudentsInInstitute()
    {
        int noOfStudents = 0;
        List<Student> students;
 
        for (Department dept : departments) {
            students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
 
public class AggregationDemo {
	public static void main(String[] args) {
		// Creating object of Student class inside main()
        Student s1 = new Student("Mia", 1, "CSE");
        Student s2 = new Student("Priya", 2, "CSE");
        Student s3 = new Student("John", 1, "EE");
        Student s4 = new Student("Rahul", 2, "EE");
 
        // Creating a List of CSE Students
        List<Student> cse_students = List.of(s1,s2);
 
        // Creating a List of EE Students
        List<Student> ee_students = List.of(s3,s4);
 
        // Creating objects of EE and CSE class inside
        // main()
        Department cse = new Department("CSE", cse_students);
        Department ee = new Department("EE", ee_students);
 
        List<Department> departments = List.of(cse, ee);
 
        // Lastly creating an instance of Institute
        Institute institute = new Institute("BITS", departments);
 
        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
	}
}
