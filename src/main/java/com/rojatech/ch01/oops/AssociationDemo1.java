package com.rojatech.ch01.oops;
class Bank {
    private String name;

    Bank(String name)
    {
        this.name = name;
    }
 
    // Method of Bank class
    public String getBankName()
    {
        return this.name;
    }
}

class Employee {
    private String name;
    Employee(String name)
    {
        this.name = name;
    }
 
    public String getEmployeeName()
    {
        return this.name;
    }
}

public class AssociationDemo1 {

	public static void main(String[] args) {
        // Creating objects of bank and Employee class
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");
 
        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                           + " is employee of "
                           + bank.getBankName());

	}

}
