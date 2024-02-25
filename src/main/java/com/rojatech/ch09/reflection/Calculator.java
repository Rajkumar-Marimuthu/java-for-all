package com.rojatech.ch09.reflection;
@MyAnnotation(value1 = "123", value2 = "456")
public class Calculator {
	private double num1;
	private double num2;
	
	public Calculator() {
		System.out.println("Default constructor");
	}
	
	public Calculator(double num1, double num2) {
		System.out.println("parametrized constructor");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double sum(double num1, double num2) {
		return num1+num2;
	}
}
