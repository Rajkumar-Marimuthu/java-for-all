package com.rojatech.ch01.oops;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
class Bank {
    private String name;
}

@AllArgsConstructor
@Getter
class Employee {
    private String name;
}

public class AssociationDemo1 {

	public static void main(String[] args) {
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");

        System.out.println(emp.getName()
                           + " is employee of "
                           + bank.getName());
	}
}
