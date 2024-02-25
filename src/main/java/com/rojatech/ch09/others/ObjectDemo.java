package com.rojatech.ch09.others;
class Subject implements Cloneable {
	int i;
	int j;
	@Override
	public String toString() {
		return "Subject [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class ObjectDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Subject s1 = new Subject();
		s1.i = 5;
		s1.j = 10;
		
		Subject s2 = s1; // Shallow copy
		
		
		Subject s3 = new Subject(); // Deep copy
		s3.i = s1.i;
		s3.j = s1.j;
		
		Subject s4 = (Subject) s1.clone();
		s2.j = 15;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		

	}

}
